package hexlet.design;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarRide {
    private Customer customer;
    private Car car;
    private LocalDate startedAt;
    private LocalDate finishedAt;
}
