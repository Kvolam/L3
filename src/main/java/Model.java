
public class Model {
    private Cup cup;
    private Student student;
    private Teapot teapot;
    private Sugar sugar;
     Model(String NameOfStudent, double Weight, int Volume){
         this.cup=new Cup();
         this.student=new Student(NameOfStudent);
         this.sugar=new Sugar(Weight);
         this.teapot=new Teapot(23,(Volume+300));
     }




    public Cup ToMakeCoffee()  {
        Coffee coffee = new Coffee(View.getSortOfCoffee(),View.getWCoffee());
        this.student.MakeCoffee(this.teapot,coffee,this.cup,this.sugar, View.getVTeapot());
        return this.cup;
    }
    public Cup ToMakeTea(){
        Tea tea = new Tea(View.getSortOfCoffee(),View.getWCoffee());
        this.student.MakeTea(this.teapot,tea,this.cup,this.sugar, View.getVTeapot());
        return this.cup;
    }
    public Cup ToMAkeCoffeeWithMilk(){
        Coffee coffee = new Coffee(View.getSortOfCoffee(),View.getWCoffee());
        Milk milk=new Milk();
        this.student.MakeCoffeeWithMilk(this.teapot,coffee,this.cup,this.sugar, milk, View.getVTeapot());
        return cup;
    }
}
