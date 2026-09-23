package hexlet.design;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CarRide {
    private Customer customer;
    private Car car;
    private LocalDate startedAt;
    private LocalDate finishedAt;
}
