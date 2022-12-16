package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double res = totalCost();
                String txt = String.format("The total price is Php %.2f", res);
                JOptionPane.showMessageDialog(pnlMain, txt);
            }
        });

    }
    public double totalCost() {
        ButtonGroup buttons = new ButtonGroup();
        buttons.add(rbNone);
        buttons.add(rb5);
        buttons.add(rb10);
        buttons.add(rb15);

        double total = 0;
            if (cPizza.isSelected())
                total += 100;
            if (cBurger.isSelected())
                total += 80;
            if (cFries.isSelected())
                total += 65;
            if (cSoftDrinks.isSelected())
                total += 55;
            if (cTea.isSelected())
                total += 50;
            if (cSundae.isSelected())
                total += 40;

            boolean flag = false;
            if (rbNone.isSelected()) {
                total = total - 0;
                flag = true;
            } else if (rb5.isSelected()) {
                total = total - (total * 0.05);
                flag = true;
            } else if (rb10.isSelected()) {
                total = total - (total * 0.10);
                flag = true;
            } else if (rb15.isSelected()) {
                total = total - (total * 0.15);
                flag = true;
            }
        return total;
    }
    public static void main(String[] args) {
        FoodOrderGUI foodApp = new FoodOrderGUI();
        foodApp.setContentPane(foodApp.pnlMain);
        foodApp.setSize(500, 700);
        foodApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodApp.setVisible(true);
        foodApp.setTitle("Food Ordering System");

    }
}
