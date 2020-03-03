package intro.micronaut.service;

import intro.micronaut.configuration.AddressConfig;
import intro.micronaut.domain.Car;
import intro.micronaut.configuration.primarybeans.ColorPicker;
import intro.micronaut.configuration.qualifier.Engine;
import intro.micronaut.queue.MessageSender;
import intro.micronaut.repository.CarRepository;
import io.micronaut.context.annotation.Value;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class CarService {

    @Value("${license_plate}")
    private String licensePlate;

    private final Engine engine;

    private final AddressConfig addressConfig;

    private final ColorPicker colorPicker;

    private final CarRepository carRepository;

    private final MessageSender messageSender;

    public CarService(@Named("v8") Engine engine, AddressConfig addressConfig,
                      ColorPicker colorPicker, CarRepository carRepository, MessageSender messageSender) {
        this.engine = engine;
        this.addressConfig = addressConfig;
        this.colorPicker = colorPicker;
        this.carRepository = carRepository;
        this.messageSender = messageSender;
    }

    public Car save(final String name) {
        final Car car = new Car();
        car.setName(name);
        car.setEngine(engine.getEngine());
        car.setCity(addressConfig.getCity());
        car.setLicensePlate(licensePlate);
        car.setColor(colorPicker.color());
        car.setProcessedQueue(Boolean.FALSE);

        final Car carSaved = carRepository.save(car);
        messageSender.send(carSaved);

        return carSaved;
    }

    public Car findById(final Long id) { ;
        return carRepository.findById(id).orElse(null);
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public void processingCar(final Car car) {
        carRepository.updateProcessedQueue(car.getId(), Boolean.TRUE);
    }
}
