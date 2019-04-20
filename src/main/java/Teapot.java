public class Teapot extends Thing{
    private double temperature;
    private int volume;
    public Teapot(double temperature, int volume) {
        this.temperature=temperature;
        this.volume=volume;
    }
    public void toPourWater(Cup cupOfDrink) {
        cupOfDrink.take(this.volume);
    }
    public void toFillWater(int volume, Cup cupOfCoffee) {
        this.volume=volume;
        this.heatUpWater();
        this.toPourWater(cupOfCoffee);
    }
    private void heatUpWater() {
        while(this.temperature<100)
        {
            this.temperature+=this.temperature/100000000;
        }
    }


    @Override
    public double getWeight() {
        return 0;
    }

}