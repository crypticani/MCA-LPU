package Swing;

import javax.swing.*;
import java.awt.event.*;

public class NetSalary implements ActionListener{
    JFrame f;
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4, t5;
    JButton b1;

    NetSalary() {
        f = new JFrame("Net Salary Calculator");

        //label to print "Basic Salary:""
        l1 = new JLabel("Basic Salary (Rs.):");
        l1.setBounds(40, 50, 200, 30);
        f.add(l1);

        //Add text box to get the basic salary as input
        t1 = new JTextField();
        t1.setBounds(170, 50, 200, 30);
        f.add(t1);

        //Another label to print: "TA:"
        l2 = new JLabel("TA (%):");
        l2.setBounds(40, 100, 100, 30);
        f.add(l2);

        //Another Text box to get the TA
        t2 = new JTextField();
        t2.setBounds(170, 100, 200, 30);
        f.add(t2);

        //Another label to print: "DA:"
        l3 = new JLabel("DA (%):");
        l3.setBounds(40, 150, 100, 30);
        f.add(l3);

        //Another Text box to get the DA
        t3 = new JTextField();
        t3.setBounds(170, 150, 200, 30);
        f.add(t3);

        //Another label to print: "HRA:"
        l4 = new JLabel("HRA (%):");
        l4.setBounds(40, 200, 100, 30);
        f.add(l4);

        //Another Text box to get the HRA
        t4 = new JTextField();
        t4.setBounds(170, 200, 200, 30);
        f.add(t4);

        //button to calculate net salary
        b1 = new JButton("Calculate");
        f.add(b1);
        b1.setBounds(100, 250, 200, 30);
        b1.addActionListener(this);

        //Another label to print: "Net Salary:"
        l5 = new JLabel("Net Salary:");
        l5.setBounds(40, 320, 100, 30);
        f.add(l5);

        //Another Text box to print the net salary
        t5 = new JTextField();
        t5.setBounds(170, 320, 200, 30);
        f.add(t5);

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String str;
        //getting the user input using action listener
        str = e.getActionCommand();
        if (str.equals("Calculate")) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = t3.getText();
            String s4 = t4.getText();
            Double bs = Double.parseDouble(s1);
            Double ta = Double.parseDouble(s2);
            Double da = Double.parseDouble(s3);
            Double hra = Double.parseDouble(s4);
            ta = (ta/100)*bs;
            da = (da/100)*bs;
            hra = (hra/100)*bs;
            Double NetSalary = bs+ta+da+hra;
            String result = String.valueOf(NetSalary);
            t5.setText(result);
        }
    }

    public static void main(String args[]) {
        new NetSalary();
    }
}
