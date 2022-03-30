package Swing;

import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");
        JLabel l = new JLabel("ARITHMATIC CALCULATIONS");
        l.setBounds(50, 10, 200, 30);
        f.add(l);
        
        JLabel l1 = new JLabel("Enter First Number");
        l1.setBounds(20, 50, 200, 30);
        f.add(l1);
        JTextField t1 = new JTextField();
        t1.setBounds(200, 50, 60, 30);
        f.add(t1);

        JLabel l2 = new JLabel("Enter Second Number");
        l2.setBounds(20, 100, 200, 30);
        f.add(l2);
        JTextField t2 = new JTextField();
        t2.setBounds(200, 100, 60, 30);
        f.add(t2);

        ButtonGroup bg = new ButtonGroup();
        JButton b1 = new JButton("+");
        b1.setBounds(20, 160, 50, 40);
        bg.add(b1);
        f.add(b1);

        JButton b2 = new JButton("-");
        b2.setBounds(80, 160, 50, 40);
        bg.add(b2);
        f.add(b2);

        JButton b3 = new JButton("X");
        b3.setBounds(135, 160, 50, 40);
        bg.add(b3);
        f.add(b3);

        JButton b4 = new JButton("%");
        b4.setBounds(190, 160, 50, 40);
        bg.add(b4);
        f.add(b4);

        JLabel l3 = new JLabel("Result");
        l3.setBounds(20, 220, 200, 30);
        f.add(l3);
        JTextField t = new JTextField();
        t.setBounds(200, 220, 60, 30);
        f.add(t);

        ActionListener ButtonChecked = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int res = 0;
                String result = Integer.toString(res);
                if (str.equals("+")) {
                    res = a+b;
                    result = Integer.toString(res);
                    t.setText(result);
                }
                else if (str.equals("-")) {
                    res = a-b;
                    result = Integer.toString(res);
                    t.setText(result);
                }
                else if (str.equals("X")) {
                    res = a*b;
                    result = Integer.toString(res);
                    t.setText(result);
                }
                else if (str.equals("%")){
                    res = a/b;
                    result = Integer.toString(res);
                    t.setText(result);
                }
                else {
                    t.setText(null);
                }
            }
        };

        b1.addActionListener(ButtonChecked);
        b2.addActionListener(ButtonChecked);
        b3.addActionListener(ButtonChecked);
        b4.addActionListener(ButtonChecked);

        f.setSize(350, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
