public class Tea extends LooseObject {
    private String sort;
    Tea(String sort, int weight){
        this.sort=sort;
        this.weight=weight;
    }
    public void toPourTea(Cup cupOfTea){
        this.toPour(cupOfTea);
        cupOfTea.take("Чай: "+this.sort);
    }

}
