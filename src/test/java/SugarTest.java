import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SugarTest {

    @Test
    public void toPourSugar() {
        Sugar sugar = new Sugar(10);
        Cup cup = new Cup();
        sugar.toPourSugar(cup);
        double actual = cup.getWeight();
        double expected = 10;
        assertEquals(actual,expected,0.2);
    }
}
