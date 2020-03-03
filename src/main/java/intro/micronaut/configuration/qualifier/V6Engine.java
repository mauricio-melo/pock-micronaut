package intro.micronaut.configuration.qualifier;

import javax.inject.Singleton;

@Singleton
public class V6Engine implements Engine {

    @Override
    public String getEngine() {
        return "V6";
    }
}