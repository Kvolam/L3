public class Coffee extends LooseObject {
    private String Taste;
    public Coffee(String Taste, int Weight) {
        this.Weight=Weight;
        this.Taste=Taste;
    }
    public void ToPourCoffee(Cup CupOfCoffee){
        this.ToPour(CupOfCoffee);
        CupOfCoffee.Take("Кофе: "+this.Taste);
    }

}