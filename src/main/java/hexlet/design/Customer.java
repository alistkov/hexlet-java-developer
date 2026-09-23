package hexlet.design;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Customer {
    @Setter
    public String name;
    private final List<CarRide> rides;

    public Customer(String name) {
        this.name = name;
        rides = new ArrayList<>();
    }

    public void addRide(CarRide ride) {
        rides.add(ride);
    }
}
