public class Coffee extends LooseObject {
    private String taste;
    public Coffee(String taste, int weight) {
        this.weight=weight;
        this.taste=taste;
    }
    public void toPourCoffee(Cup CupOfCoffee){
        this.toPour(CupOfCoffee);
        CupOfCoffee.take("Кофе: "+this.taste);
    }

}