import org.junit.Test;

import static org.junit.Assert.*;


public class ModelTest {
    @Test
    public void toMake() {
        Cup cup = new Cup();
        Student student = new Student("Victor");
        Teapot teapot= new Teapot(23.2, 300);
        Sugar sugar = new Sugar (10);
        Coffee coffee = new Coffee("Americano",5);
        student.makeCoffee(teapot,coffee,cup,sugar, 200);
        double W_actual = cup.getWeight();
        double W_expected = 15;
        assertEquals(W_actual,W_expected,0.2);
        String actual = cup.getContent();
        String expected = "Кофе: Americano с сахаром";
        assertEquals(actual,expected);
        int V_Actual = cup.getVolume();
        int V_Expected=200;
        assertEquals(V_Expected,V_Actual);
    }


    @Test
    public void toMakeTea() {
        Cup cup = new Cup();
        Student student = new Student("Victor");
        Teapot teapot= new Teapot(23.2, 300);
        Sugar sugar = new Sugar (10);
        Tea coffee = new Tea("Чёрный чай",5);
        student.makeTea(teapot,coffee,cup,sugar, 200);
        double W_actual = cup.getWeight();
        double W_expected = 15;
        assertEquals(W_actual,W_expected,0.2);
        String actual = cup.getContent();
        String expected = "Чай: Чёрный чай с сахаром";
        assertEquals(actual,expected);
        int V_Actual = cup.getVolume();
        int V_Expected=200;
        assertEquals(V_Expected,V_Actual);
    }

    @Test
    public void toMAkeCoffeeWithMilk() {
        Cup cup = new Cup();
        Student student = new Student("Victor");
        Teapot teapot= new Teapot(23.2, 300);
        Sugar sugar = new Sugar (10);
        Coffee coffee = new Coffee("Americano",5);
        Milk milk = new Milk();
        student.makeCoffeeWithMilk(teapot,coffee,cup,sugar, milk,200);
        double W_actual = cup.getWeight();
        double W_expected = 15;
        assertEquals(W_actual,W_expected,0.2);
        String actual = cup.getContent();
        String expected = "Кофе: Americano с молоком и с сахаром";
        assertEquals(actual,expected);
        int V_Actual = cup.getVolume();
        int V_Expected=200;
        assertEquals(V_Expected,V_Actual);
    }
}
