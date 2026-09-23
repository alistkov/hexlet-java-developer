package hexlet.design.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class PizzaTest {
    @Test
    public void testPizzaWithAllParams() {
        var pizza =
                Pizza.builder()
                        .size("small")
                        .dough("thin")
                        .sauce("cream")
                        .meatTopping("beef")
                        .vegetableTopping("mushrooms")
                        .cheeseTopping("mozzarella")
                        .build();

        assertEquals("small", pizza.getSize());
        assertEquals("thin", pizza.getDough());
        assertEquals("cream", pizza.getSauce());
        assertEquals("beef", pizza.getMeatTopping());
        assertEquals("mushrooms", pizza.getVegetableTopping());
        assertEquals("mozzarella", pizza.getCheeseTopping());
    }

    @Test
    public void testPizzaWithoutAllParams() {
        var pizza =
                Pizza.builder()
                        .size("big")
                        .dough("thin")
                        .sauce("tomato")
                        .vegetableTopping("onion")
                        .cheeseTopping("mozzarella")
                        .build();

        assertEquals("big", pizza.getSize());
        assertEquals("thin", pizza.getDough());
        assertEquals("tomato", pizza.getSauce());
        assertNull(pizza.getMeatTopping());
        assertEquals("onion", pizza.getVegetableTopping());
        assertEquals("mozzarella", pizza.getCheeseTopping());
    }
}
