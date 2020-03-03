package intro.micronaut.primarybeans;

import javax.inject.Singleton;

@Singleton
public class Blue implements ColorPicker {

    @Override
    public String color() {
        return "blue";
    }
}