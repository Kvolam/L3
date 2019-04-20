import javax.swing.*;

public class UserInterface {

    public static void chooseMenu()
    {
        JFrame frame = new JFrame("Choose");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 175);
        frame.setResizable(false);
        View.Choose(frame.getContentPane());
        frame.setVisible(true);
        View.coffeeButton.addActionListener(e -> {
          UserInterface.createAndShowGUI("Кофе");
        });
        View.teaButton.addActionListener(e -> {
            UserInterface.createAndShowGUI("Чай");
        });
        View.coffeeWithMilkButton.addActionListener(e -> {
            UserInterface.createAndShowGUI("Кофе с молоком");
        });
    }

    private static void createAndShowGUI(String TypeOfDrink) {
        JFrame frame = new JFrame(TypeOfDrink);
        frame.setSize(250, 175);
        frame.setResizable(true);
        View.addComponents(frame.getContentPane(),  TypeOfDrink);
        frame.setVisible(true);
        View.calculateButton.addActionListener(e -> {
            try {
               Model model = new Model(View.getNameOfStudent(), View.getWSugar(), View.getVTeapot());
                if(TypeOfDrink.equals("Кофе")) {
                    if(model.toMakeCoffee())
                        JOptionPane.showMessageDialog(null, model.contentOF() + " готов");
                }
                else if(TypeOfDrink.equals("Чай")){
                    if(model.toMakeTea())
                        JOptionPane.showMessageDialog(null, model.contentOF()+" готов");
                }
                else{
                    if(model.toMAkeCoffeeWithMilk())
                        JOptionPane.showMessageDialog(null, model.contentOF()+" готов");
                }
            }
            catch (ExceptionString ex)
            {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }


        });
    }

}
