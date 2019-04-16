import javax.swing.*;

public class UserInterface {

    public static void ChooseMenu()
    {
        JFrame frame = new JFrame("Choose");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 175);
        frame.setResizable(false);
        View.Choose(frame.getContentPane());
        frame.setVisible(true);
        View.CoffeeButton.addActionListener(e -> {
          UserInterface.createAndShowGUI("Кофе");
        });
        View.TeaButton.addActionListener(e -> {
            UserInterface.createAndShowGUI("Чай");
        });
        View.CoffeeWithMilkButton.addActionListener(e -> {
            UserInterface.createAndShowGUI("Кофе с молоком");
        });
    }

    public static void createAndShowGUI(String TypeOfDrink) {
        JFrame frame = new JFrame(TypeOfDrink);
        frame.setSize(250, 175);
        frame.setResizable(true);
        View.addComponents(frame.getContentPane(),  TypeOfDrink);
        frame.setVisible(true);
        View.calculateButton.addActionListener(e -> {
            Model model= new Model(View.getNameOfStudent(), View.getWSugar(),View.getVTeapot());
            if(TypeOfDrink=="Кофе")
                JOptionPane.showMessageDialog(null,model.ToMakeCoffee().getContent()+" готов");
            else if(TypeOfDrink=="Чай")
                JOptionPane.showMessageDialog(null,model.ToMakeTea().getContent()+" готов");
            else
                JOptionPane.showMessageDialog(null,model.ToMAkeCoffeeWithMilk().getContent()+" готов");
        });
    }

}
