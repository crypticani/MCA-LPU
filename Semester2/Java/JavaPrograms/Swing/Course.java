package Swing;

import javax.swing.*;
import java.awt.event.*;

public class Course {
    public static void main(String[] args) {

        JFrame f = new JFrame("Course Selection");
        JLabel l = new JLabel("Select Course");
        l.setBounds(50, 10, 100, 30);
        f.add(l);
        ButtonGroup bg = new ButtonGroup();

        JRadioButton r1 = new JRadioButton("MCA");
        r1.setBounds(75, 50, 100, 30);
        bg.add(r1);
        f.add(r1);

        JRadioButton r2 = new JRadioButton("MSc IT");
        r2.setBounds(75, 100, 100, 30);
        bg.add(r2);
        f.add(r2);

        JRadioButton r3 = new JRadioButton("BCA");
        r3.setBounds(75, 150, 100, 30);
        bg.add(r3);
        f.add(r3);

        JTextField t = new JTextField();
        t.setBounds(50, 250, 250, 30);
        f.add(t);

        ActionListener ButtonChecked = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("MCA")) {
                    t.setText("You have Selected MCA");
                }
                else if (str.equals("MSc IT")) {
                    t.setText("You have Selected MSc IT");
                }
                else if (str.equals("BCA")) {
                    t.setText("You have Selected BCA");
                }
                else {
                    t.setText(null);
                }
            }
        };

        r1.addActionListener(ButtonChecked);
        r2.addActionListener(ButtonChecked);
        r3.addActionListener(ButtonChecked);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
