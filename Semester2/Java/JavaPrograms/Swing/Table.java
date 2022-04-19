package Swing;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

public class Table implements ActionListener {
    JFrame f;
    JLabel l0;
    JTextField t1;
    JTextArea ta;
    JButton b1;

    Table() {
        f = new JFrame("Table");

        l0 = new JLabel("Enter Number:");
        l0.setBounds(40, 50, 200, 30);
        Font font = new Font("Segoe Script", Font.BOLD, 20);
        l0.setFont(font);
        f.add(l0);

        t1 = new JTextField();
        t1.setBounds(220, 50, 150, 30);
        f.add(t1);

        b1 = new JButton("Print");
        f.add(b1);
        b1.setBounds(100, 100, 150, 30);
        b1.addActionListener(this);

        ta = new JTextArea();
        ta.setBounds(150, 150, 60, 300);
        Font font1 = new Font("Segoe Script", Font.BOLD, 20);
        ta.setFont(font1);
        f.add(ta);

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        String str;
        //getting the user input using action listener
        str = e.getActionCommand();
        if (str.equals("Print")) {
            String s1 = t1.getText();
            int n = Integer.parseInt(s1);
            for(int i=1; i<=10; i++){
                String n1 = String.valueOf(n*i);
                ta.append(n1);
                ta.append("\n");
            }
        }
    }

    public static void main(String args[]) {
        new Table();
    }
}
