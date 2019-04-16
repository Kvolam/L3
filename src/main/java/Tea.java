public class Tea extends LooseObject {
    private String Sort;
    Tea(String Sort, int Weight){
        this.Sort=Sort;
        this.Weight=Weight;
    }
    public void ToPourTea(Cup CupOfTea){
        this.ToPour(CupOfTea);
        CupOfTea.Take("Чай: "+this.Sort);
    }

}
