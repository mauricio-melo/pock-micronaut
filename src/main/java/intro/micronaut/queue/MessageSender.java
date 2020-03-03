package intro.micronaut.queue;

import intro.micronaut.domain.Car;
import io.micronaut.configuration.rabbitmq.annotation.Binding;
import io.micronaut.configuration.rabbitmq.annotation.RabbitClient;
import io.micronaut.context.annotation.Requires;

import static intro.micronaut.constant.Constants.CAR_SAVED_QUEUE;

@RabbitClient 
public interface MessageSender {

    @Binding(CAR_SAVED_QUEUE)
    void send(final Car data);
}