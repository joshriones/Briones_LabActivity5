package LeapYear;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LeapYearGUI extends JFrame{

    private JTextField tfYear;
    private JButton btnCheckYear;
    private JLabel lYear;
    private JPanel pnlMain;

    public LeapYearGUI(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    isLeapYear();
            }
        });

    }

    public void isLeapYear(){
            boolean flag;
            int year = Integer.parseInt(tfYear.getText());
            if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                JOptionPane.showMessageDialog(pnlMain,"Leap Year");
            }else {
                JOptionPane.showMessageDialog(pnlMain,"Not Leap Year");
            }
    }
    public static void main(String[] args) {
        LeapYearGUI leapYrApp = new LeapYearGUI();
        leapYrApp.setContentPane(leapYrApp.pnlMain);
        leapYrApp.setSize(500, 700);
        leapYrApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapYrApp.setVisible(true);

    }

}

