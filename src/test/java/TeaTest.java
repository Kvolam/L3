import org.junit.Test;

import static org.junit.Assert.*;

public class TeaTest {

    @Test
    public void toPourTea() {
        Tea coffee=new Tea( "Чёрный чай",5);
        Cup cup = new Cup();
        coffee.toPourTea(cup);
        double W_actual = cup.getWeight();
        double W_expected = 5;
        assertEquals(W_actual,W_expected,0.2);
        String actual = cup.getContent();
        String expected = "Чай: Чёрный чай";
        assertEquals(actual,expected);
    }
}