package intro.micronaut.repository;

import intro.micronaut.domain.Car;
import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Singleton
public class CarRepositoryImpl implements CarRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public CarRepositoryImpl(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Car> findById(@NotNull final Long id) {
        return Optional.ofNullable(entityManager.find(Car.class, id));
    }

    @Override
    @Transactional
    public Car save(@NotBlank final Car car) {
        entityManager.persist(car);
        return car;
    }

    @Override
    @Transactional
    public void deleteById(@NotNull final Long id) {
        findById(id).ifPresent(entityManager::remove);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Car> findAll() {
        return entityManager.createQuery("SELECT c FROM Car c", Car.class).getResultList();
    }
}
