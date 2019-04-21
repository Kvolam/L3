import org.junit.Test;

import static org.junit.Assert.*;


public class CoffeeTest {
    @Test
    public void pourToCoffee() {
        Coffee coffee=new Coffee( "Americano",5);
        Cup cup = new Cup();
        coffee.toPourCoffee(cup);
        double W_actual = cup.getWeight();
        double W_expected = 5;
        assertEquals(W_actual,W_expected,0.2);
        String actual = cup.getContent();
        String expected = "Кофе: Americano";
        assertEquals(actual,expected);
    }
}
