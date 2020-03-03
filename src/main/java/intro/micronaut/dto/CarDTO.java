package intro.micronaut.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarDTO {

    private String name;
    private String engine;
    private String city;
    @JsonProperty("license_plate")
    private String licensePlate;
    private String color;

    public CarDTO(String name, String engine, String city, String licensePlate, String color) {
        this.name = name;
        this.engine = engine;
        this.city = city;
        this.licensePlate = licensePlate;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
