package intro.micronaut.domain;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idt_car")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "engine")
    private String engine;

    @Column(name = "city")
    private String city;

    @Column(name = "license_plate")
    private String licensePlate;

    @Column(name = "color")
    private String color;

    @Column(name = "processed_queue")
    private Boolean processedQueue;

    public Car() {
    }

    public Car(Long id, String name, String engine, String city, String licensePlate, String color, Boolean processedQueue) {
        this.id = id;
        this.name = name;
        this.engine = engine;
        this.city = city;
        this.licensePlate = licensePlate;
        this.color = color;
        this.processedQueue = processedQueue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getProcessedQueue() {
        return processedQueue;
    }

    public void setProcessedQueue(Boolean processedQueue) {
        this.processedQueue = processedQueue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", city='" + city + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", color='" + color + '\'' +
                ", processedQueue=" + processedQueue +
                '}';
    }

}
