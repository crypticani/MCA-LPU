package Swing;

import javax.swing.*;
import java.awt.event.*;

class SwingDemo1 implements ActionListener {
    JFrame f;
    JButton b1, b2;
    JTextField t1;

    SwingDemo1() {
        f = new JFrame("Swing Demo");
        t1 = new JTextField();
        t1.setBounds(100, 100, 150, 30);
        f.add(t1);
        b1 = new JButton("Show Message");
        b1.setBounds(100, 200, 150, 30);
        f.add(b1);
        b2 = new JButton("Clear Message");
        b2.setBounds(100, 300, 150, 30);
        f.add(b2);
        f.setLayout(null);
        f.setSize(600, 600);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("Show Message")) {
            t1.setText("You have Pressed a button");
        } else {
            t1.setText(null);
        }
    }

    public static void main(String args[]) {
        new SwingDemo1();
    }
}