package intro.micronaut.repository;

import intro.micronaut.domain.Car;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface CarRepository {

    Optional<Car> findById(@NotNull final Long id);

    Car save(@NotBlank final Car car);

    void deleteById(@NotNull final Long id);

    List<Car> findAll();

    void updateProcessedQueue(@NotNull Long id, @NotBlank Boolean processedQueue);
}