import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class View {

    private static JTextField nameOfStudent;
    private static JTextField sortOfCoffee;
    private static JTextField wSugar;
    private static JTextField vTeapot;
    public static JButton calculateButton;
    private static JTextField wDrink;
    public static JButton coffeeButton;
    public static JButton teaButton;
    public static JButton coffeeWithMilkButton;
    public static void addComponents(Container pane, String TypeOfDrink) {
        pane.setLayout(new GridBagLayout());
        pane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
        constraints.gridx = 0;
        constraints.gridy = 0;
        pane.add(new JLabel("Имя студента"), constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        nameOfStudent = new JTextField();
        pane.add(nameOfStudent, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        pane.add(new JLabel("Объём"), constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        vTeapot = new JTextField();
        pane.add(vTeapot, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        if(TypeOfDrink.equals("Чай")) {
            pane.add(new JLabel("Сорт чая"), constraints);
            constraints.gridx = 0;
            constraints.gridy = 5;
            pane.add(new JLabel("Кол-во чая"), constraints);
        }

        else
        {
            pane.add(new JLabel("Сорт кофе"), constraints);
            constraints.gridx = 0;
            constraints.gridy = 5;
            pane.add(new JLabel("Кол-во кофе"), constraints);
        }

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        sortOfCoffee = new JTextField();
        pane.add(sortOfCoffee, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        pane.add(new JLabel("Кол-во сахара"), constraints);
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        wSugar = new JTextField();
        pane.add(wSugar, constraints);

        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        wDrink = new JTextField();
        pane.add(wDrink, constraints);
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        calculateButton = new JButton("Приготовить");
        calculateButton.setPreferredSize(new Dimension(75, 20));
        pane.add(calculateButton, constraints);
    }
    public static void Choose(Container pane)
    {
        pane.setLayout(new GridBagLayout());
        pane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        coffeeButton = new JButton("Сделать кофе");
        pane.add(coffeeButton, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        teaButton = new JButton("Сделать чай");
        pane.add(teaButton, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        coffeeWithMilkButton = new JButton("Сделать кофе с молоком");
        pane.add(coffeeWithMilkButton, constraints);
    }



    static public String getNameOfStudent ()throws Exception{
        if(nameOfStudent.getText().matches("(?i).*[A-zА-я].*"))
        {
            return nameOfStudent.getText();
        }
        else throw new Exception("Некоректное имя студента");
    }
    static public String getSortOfCoffee()throws  Exception{
        if(sortOfCoffee.getText().matches("(?i).*[A-zА-я].*")) {
            return sortOfCoffee.getText();
        }
        else throw new Exception("Некоректный сорт кофе/чая");
    }
    static public double getWSugar() throws  Exception{
        if(wSugar.getText().matches("(?i).*[0-9,.].*"))
        {
          return Double.parseDouble(wSugar.getText());
        }
        else throw new Exception("Неверное число в поле Кол-во сахара");
    }
    static public int getWDrink() throws Exception{
        if(wDrink.getText().matches("(?i).*[0-9,.].*")){
            return Integer.parseInt(wDrink.getText());
        }
        else throw new Exception("Неверное число в поле кол-во кофе/чая");
    }
    static  public int getVTeapot() throws Exception{
        if(vTeapot.getText().matches("(?i).*[0-9,.].*")){
            return Integer.parseInt(vTeapot.getText());
        }
        else throw new Exception("Неверное число в поле объём напитка");
    }

}