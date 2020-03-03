package intro.micronaut.configuration;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("address")
public class AddressConfig {

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
