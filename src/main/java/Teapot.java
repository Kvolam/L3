public class Teapot extends Thing{
    private double Temperature;
    private int Volume;
    public Teapot(double Temperature, int Volume) {
        this.Temperature=Temperature;
        this.Volume=Volume;
    }
    public void ToPourWater(Cup CupOfDrink) {
        CupOfDrink.Take(this.Volume);
    }
    public void ToFillWater(int Volume, Cup CupOfCoffee) {
        this.Volume=Volume;
        this.HeatUpWater();
        this.ToPourWater(CupOfCoffee);
    }
    private void HeatUpWater() {
        while(this.Temperature<100)
        {
            this.Temperature+=this.Temperature/100000000;
        }
    }


    @Override
    public double getWeight() {
        return 0;
    }
    @Override
    public void setWeight(double weight) {
    }
}