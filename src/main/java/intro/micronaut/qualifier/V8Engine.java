package intro.micronaut.qualifier;

import javax.inject.Singleton;

@Singleton
public class V8Engine implements Engine {

    @Override
    public String getEngine() {
        return "V8";
    }
}