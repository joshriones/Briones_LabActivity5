package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel pnlMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI foodApp = new FoodOrderGUI();
        foodApp.setContentPane(foodApp.pnlMain);
        foodApp.setSize(500, 700);
        foodApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodApp.setVisible(true);
    }
}
