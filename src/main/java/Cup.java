public class Cup extends Thing {
    private int volume;
    private String content;
    public Cup() {
        this.volume = 0;
        this.content = null;
    }
    public String getContent(){
        return this.content;
    }

    public void take(String content){
        if(this.content==null)
            this.content=content;
        else
            this.content+=content;
    }

    public void take(int volume){
        this.volume+=volume;
    }

    public void take(double weight){
        this.weight+=weight;
    }
    @Override
     public double getWeight() {
        return this.weight;
    }

    public int getVolume(){
        return this.volume;
    }
}