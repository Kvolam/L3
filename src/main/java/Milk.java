public class Milk extends  Thing{
    Milk(){}
    public void ToPourMilk(Cup cup){
        cup.Take(" с молоком и");
    }

    @Override
    double getWeight() {
        return 0;
    }

    @Override
    void setWeight(double weight) {
    }
}
