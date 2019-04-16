public class Sugar extends LooseObject{
    public Sugar(double Weight) {
        this.Weight=Weight;
    }
    public void ToPourSugar(Cup CupOfDrink){
        this.ToPour(CupOfDrink);
        if(this.Weight==0)
            CupOfDrink.Take(" без сахара");
        else
            CupOfDrink.Take(" c сахаром");
    }

}