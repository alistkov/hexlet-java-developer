package hexlet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testGetPizza() {
        var pizza = App.getPizza();

        assertEquals("big", pizza.getSize());
        assertEquals("thin", pizza.getDough());
        assertEquals("mozzarella", pizza.getCheeseTopping());
        assertEquals("tomato", pizza.getSauce());
        assertEquals("basil", pizza.getVegetableTopping());
    }
}
