package FoodOrdering;

import javax.swing.*;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
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
                totalCost();

            }
        });

    }

    public void totalCost() {
        try {
            ButtonGroup buttons = new ButtonGroup();
            buttons.add(rbNone);
            buttons.add(rb5);
            buttons.add(rb10);
            buttons.add(rb15);

            double total = 0;
            int selected = 0;

            if (cPizza.isSelected()) {
                total += 100;
                selected = 1;
            }
            if (cBurger.isSelected()) {
                total += 80;
                selected = 1;
            }
            if (cFries.isSelected()) {
                total += 65;
                selected = 1;
            }
            if (cSoftDrinks.isSelected()) {
                total += 55;
                selected = 1;
            }
            if (cTea.isSelected()) {
                total += 50;
                selected = 1;
            }
            if (cSundae.isSelected()) {
                total += 40;
                selected = 1;
            }

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
            if (!flag || selected == 0) {
                throw new InvalidDnDOperationException("No items or discount selected");
            }
            String txt = String.format("The total price is Php %.2f", total);
            JOptionPane.showMessageDialog(pnlMain, txt);
        } catch (InvalidDnDOperationException e) {
            JOptionPane.showMessageDialog(pnlMain, e.getMessage(), "Invalid", JOptionPane.ERROR_MESSAGE);
        }
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
