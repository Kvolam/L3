public class Cup extends Thing {
    private int Volume;
    private String Content;
    public Cup(){
        this.Volume=0;
        this.Content=null;
    }
    /*public void ToFill(int Volume){
        this.Volume+=Volume;
    }
    public void ToFill(int Weight,String Content){
        if(this.Content==null)
            this.Content=Content;
        else
            this.Content+=", "+Content;
        this.setWeight(this.getWeight()+Weight);
    }*/
    public String getContent(){
        return this.Content;
    }

    public void Take(String content){
        if(this.Content==null)
            this.Content=content;
        else
            this.Content+=content;
    }

    public void Take(int volume){
        this.Volume+=volume;
    }

    public void Take(double Weight){
        this.Weight=Weight;
    }
    @Override
     public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double weight) {
        this.Weight=weight;
    }
}