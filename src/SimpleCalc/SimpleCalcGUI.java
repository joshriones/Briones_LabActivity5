package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {
        SimpleCalcGUI calcApp = new SimpleCalcGUI();
        calcApp.setContentPane(calcApp.pnlMain);
        calcApp.setSize(500, 700);
        calcApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calcApp.setVisible(true);
    }
}
