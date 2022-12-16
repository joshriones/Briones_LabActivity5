package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField tfResult;

    public SimpleCalcGUI(){
        tfResult.setEditable(false);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcFunc();
            }
        });

    }
    public void calcFunc(){
        double num1 = Integer.parseInt(tfNumber1.getText());
        double num2 = Integer.parseInt(tfNumber2.getText());

        String op = (String)cbOperations.getSelectedItem();

        switch (Objects.requireNonNull(op)){
            case "+":
                double sum = num1 + num2;
                tfResult.setText((String.format("%.0f",sum)));
                break;
            case "-":
                double diff = num1 - num2;
                tfResult.setText((String.format("%.0f",diff)));
                break;
            case "*":
                double prod = num1 * num2;
                tfResult.setText((String.format("%.0f",prod)));
                break;
            case "/":
                double quo = num1 / num2;
                tfResult.setText((String.format("%.2f", quo)));
                break;
        }

    }
    public static void main(String[] args) {
        SimpleCalcGUI calcApp = new SimpleCalcGUI();
        calcApp.setContentPane(calcApp.pnlMain);
        calcApp.setSize(600, 700);
        calcApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calcApp.setVisible(true);
    }
}
