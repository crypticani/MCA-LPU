package Swing;

import javax.swing.*;
import java.awt.event.*;

public class Addition implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    Addition() {
        f = new JFrame("TextField Example");
        l1 = new JLabel("Enter No.1");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);
        l2 = new JLabel("Enter No.2");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);
        b1 = new JButton("Click To get The sum");
        f.add(b1);
        b1.setBounds(50, 150, 200, 30);
        b1.addActionListener(this);
        l3 = new JLabel("Result:");
        l3.setBounds(50, 200, 100, 30);
        f.add(l3);
        t1 = new JTextField();
        t1.setBounds(200, 50, 150, 30);
        f.add(t1);
        t2 = new JTextField();
        t2.setBounds(200, 100, 150, 30);
        f.add(t2);
        t3 = new JTextField();
        t3.setBounds(200, 200, 150, 30);
        f.add(t3);
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String str;
        str = e.getActionCommand();
        if (str.equals("Click To get The sum")) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c;
            c = a + b;
            String r = String.valueOf(c);
            t3.setText(r);
        }

    }

    public static void main(String args[]) {
        new Addition();
    }
}
