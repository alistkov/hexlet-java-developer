package hexlet.classes;

import java.util.Objects;

public final class Car {

    private String made;
    private String model;
    private int produced;

    public Car(String made, String model, int produced) {
        this.made = made;
        this.model = model;
        this.produced = produced;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        var car = (Car) obj;
        return car.made.equals(made) && car.model.equals(model) && car.produced == produced;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, model, produced);
    }
}
