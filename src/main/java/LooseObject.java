public  class LooseObject extends Thing {

    public void ToPour(Cup cup){
        cup.Take(this.Weight);
    }

    @Override
    public double getWeight() {
        return this.Weight;
    }
    @Override
    public void setWeight(double weight) {
        this.Weight=weight;
    }
}
