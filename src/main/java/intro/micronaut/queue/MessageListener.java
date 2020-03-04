package intro.micronaut.queue;

import intro.micronaut.domain.Car;
import intro.micronaut.service.CarService;
import io.micronaut.configuration.rabbitmq.annotation.Queue;
import io.micronaut.configuration.rabbitmq.annotation.RabbitListener;

import static intro.micronaut.constant.Constants.CAR_SAVED_QUEUE;

//@RabbitListener
public class MessageListener {

    private final CarService carService;

    public MessageListener(CarService carService) {
        this.carService = carService;
    }

//    @Queue(CAR_SAVED_QUEUE)
    public void receive(final Car car) {
        System.out.println("Car received " + car.toString());
        carService.processingCar(car);
    }
}