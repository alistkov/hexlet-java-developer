package hexlet.design;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Car {
    private final String model;
    private final String vin;
    private final List<CarRide> rides;

    public Car(String model, String vin) {
        this.model = model;
        this.vin = vin;
        rides = new ArrayList<>();
    }

    public void addRide(CarRide ride) {
        rides.add(ride);
    }
}
