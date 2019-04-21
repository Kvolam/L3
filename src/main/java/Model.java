import javax.swing.*;

public class Model {
    private Cup cup;
    private Student student;
    private Teapot teapot;
    private Sugar sugar;
    private Coffee coffee;
    Model(String nameOfStudent, double weight, int volume){
         this.cup=new Cup();
         this.student=new Student(nameOfStudent);
         this.sugar=new Sugar(weight);
         this.teapot=new Teapot(23,(volume+300));
    }

    public boolean toMakeCoffee()  {
         coffee = null;
         boolean ready=false;
         try{
         coffee = new Coffee(View.getSortOfCoffee(),View.getWDrink());
         this.student.makeCoffee(this.teapot,coffee,this.cup,this.sugar, View.getVTeapot());
         ready=true;
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage());
         }
        return ready;
    }
    public boolean toMakeTea(){
        coffee = null;
        boolean ready=false;
        try {
            Tea tea = new Tea(View.getSortOfCoffee(), View.getWDrink());
            this.student.makeTea(this.teapot, tea, this.cup, this.sugar, View.getVTeapot());
            ready = true;
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return ready;
    }
    public boolean toMAkeCoffeeWithMilk(){
        coffee = null;
        boolean ready = false;
        try {
            Coffee coffee = new Coffee(View.getSortOfCoffee(), View.getWDrink());
            Milk milk = new Milk();
            this.student.makeCoffeeWithMilk(this.teapot, coffee, this.cup, this.sugar, milk, View.getVTeapot());
            ready=true;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return ready;
    }
    public String contentOF(){
        return cup.getContent();
    }
}
