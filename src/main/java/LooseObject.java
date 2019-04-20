public  class LooseObject extends Thing {

    public void toPour(Cup cup){
        cup.take(this.weight);
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
