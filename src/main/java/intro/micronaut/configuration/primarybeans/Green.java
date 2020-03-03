package intro.micronaut.configuration.primarybeans;

import io.micronaut.context.annotation.Primary;
import javax.inject.Singleton;

@Primary
@Singleton
public class Green implements ColorPicker {

    @Override
    public String color() {
        return "green";
    }
}