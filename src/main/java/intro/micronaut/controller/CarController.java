package intro.micronaut.controller;

import intro.micronaut.domain.Car;
import intro.micronaut.service.CarService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@Controller(CarController.CAR_ENDPOINT)
public class CarController {

    public static final String CAR_ENDPOINT = "/car";

    @Inject
    private CarService carService;

    @Post(value = "/{name}")
    public HttpResponse<Car> save(final String name) {
        final Car car = carService.save(name);
        return HttpResponse
                .created(car)
                .headers(headers -> headers.location(URI.create(CAR_ENDPOINT + "/" + car.getId())));
    }

    @Get(value = "/{id}", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<Car> findById(final Long id) {
        return HttpResponse.ok(carService.findById(id));
    }

    @Get(produces = MediaType.APPLICATION_JSON)
    public HttpResponse<List<Car>> findAll() {
        return HttpResponse.ok(carService.findAll());
    }

}