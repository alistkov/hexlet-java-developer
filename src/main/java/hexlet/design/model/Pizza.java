package hexlet.design.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Pizza {
    private String size;
    private String dough;
    private String sauce;
    private String meatTopping;
    private String vegetableTopping;
    private String cheeseTopping;
}
