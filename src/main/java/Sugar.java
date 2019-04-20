public class Sugar extends LooseObject{
    public Sugar(double weight) {

        this.weight=weight;
    }
    public void toPourSugar(Cup cupOfDrink){
        this.toPour(cupOfDrink);
        if(this.weight==0)
            cupOfDrink.take(" без сахара");
        else
            cupOfDrink.take(" с сахаром");
    }

}