
import org.junit.Test;
import static org.junit.Assert.*;

public class TeapotTest {

    @Test
    public void toPourWater() {
        Teapot teapot = new Teapot(100, 200);
        Cup cup = new Cup();
        teapot.toPourWater(cup);
        int actual = cup.getVolume();
        int expected = 200;
        assertEquals(actual,expected);
    }

    @Test
    public void toFillWater() {
        Teapot teapot = new Teapot(20, 500);
        Cup cup = new Cup();
        teapot.toFillWater(200,cup);
        int V_actual = cup.getVolume();
        int V_expected = 200;
        assertEquals(V_actual,V_expected);
    }
}
