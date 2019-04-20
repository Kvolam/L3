public class Student {
    private String Name;
    Student(String Name )
    {
        this.Name=Name;
    }
    public void makeCoffee(Teapot teapot, Coffee coffee, Cup cup, Sugar sugar, int Volume) {
        coffee.toPourCoffee(cup);
        sugar.toPourSugar(cup);
        teapot.toFillWater(Volume, cup);
    }
    public void makeTea(Teapot teapot, Tea tea, Cup cup, Sugar sugar, int Volume){
        tea.toPourTea(cup);
        sugar.toPourSugar(cup);
        teapot.toFillWater(Volume, cup);
    }
    public void makeCoffeeWithMilk(Teapot teapot, Coffee coffee, Cup cup, Sugar sugar, Milk milk, int Volume){
        coffee.toPourCoffee(cup);
        milk.toPourMilk(cup);
        sugar.toPourSugar(cup);
        teapot.toFillWater(Volume, cup);
    }
}