import org.junit.Test;

import static org.junit.Assert.*;

public class CupTest {
    @org.junit.Test
    public void takeS() {
        Cup cup = new Cup();
        cup.take("Sugar");
        String actual = cup.getContent();
        String expected = "Sugar";
        assertEquals(actual,expected);
    }

    @org.junit.Test
    public void takeI() {
        Cup cup = new Cup();
        cup.take(200);
        int actual = cup.getVolume();
        int expected = 200;
        assertEquals(actual,expected);
    }

    @Test
    public void takeD() {
        Cup cup = new Cup();
        cup.take(10);
        double W_actual = cup.getWeight();
        double W_expected = 10;
        assertEquals(W_actual,W_expected,0.2);
    }
}
