public class Milk extends  Thing{
    Milk(){}
    public void toPourMilk(Cup cup){
        cup.take(" с молоком и");
    }

    @Override
    double getWeight() {
        return 0;
    }

}
