package hexlet.design;

import java.time.LocalDate;

public class Exercise {
    public static CarRide getRide(Customer customer, Car car) {
        var ride = new CarRide();
        ride.setCar(car);
        ride.setCustomer(customer);
        ride.setStartedAt(LocalDate.now());
        customer.addRide(ride);
        car.addRide(ride);
        return ride;
    }
}
