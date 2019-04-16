public class Student {
    private String Name;
    Student(String Name )
    {
        this.Name=Name;
    }
    public void MakeCoffee(Teapot teapot, Coffee coffee, Cup cup, Sugar sugar, int Volume) {
        coffee.ToPourCoffee(cup);
        sugar.ToPourSugar(cup);
        teapot.ToFillWater(Volume, cup);
    }
    public void MakeTea(Teapot teapot, Tea tea, Cup cup, Sugar sugar, int Volume){
        tea.ToPourTea(cup);
        sugar.ToPourSugar(cup);
        teapot.ToFillWater(Volume, cup);
    }
    public void MakeCoffeeWithMilk(Teapot teapot, Coffee coffee, Cup cup, Sugar sugar, Milk milk, int Volume){
        coffee.ToPourCoffee(cup);
        milk.ToPourMilk(cup);
        sugar.ToPourSugar(cup);
        teapot.ToFillWater(Volume, cup);
    }
}