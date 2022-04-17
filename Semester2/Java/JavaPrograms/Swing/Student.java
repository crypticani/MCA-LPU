package Swing;

import javax.swing.*;
import java.awt.event.*;

public class Student implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    Student() {
        f = new JFrame("Student Details");

        //label to print "Enter Name of Student:""
        l1 = new JLabel("Enter Name of Student:");
        l1.setBounds(40, 50, 200, 30);
        f.add(l1);

        //Add text box to get the name as input
        t1 = new JTextField();
        t1.setBounds(220, 50, 150, 30);
        f.add(t1);

        //button to get the result
        b1 = new JButton("Enter");
        f.add(b1);
        b1.setBounds(100, 100, 200, 30);
        b1.addActionListener(this);

        //Another label to print: "Result:"
        l2 = new JLabel("Name:");
        l2.setBounds(40, 200, 100, 30);
        f.add(l2);

        //Another Text box to display student name
        t2 = new JTextField();
        t2.setBounds(150, 200, 200, 30);
        f.add(t2);

        //Another label to print: "Course:"
        l3 = new JLabel("Course:");
        l3.setBounds(40, 250, 100, 30);
        f.add(l3);

        //Another Text box to display student course
        t3 = new JTextField();
        t3.setBounds(150, 250, 200, 30);
        f.add(t3);

        //Another label to print: "Result:"
        l4 = new JLabel("College:");
        l4.setBounds(40, 300, 100, 30);
        f.add(l4);

        //Another Text box to display student name
        t4 = new JTextField();
        t4.setBounds(150, 300, 200, 30);
        f.add(t4);

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        String str;
        //getting the user input using action listener
        str = e.getActionCommand();
        if (str.equals("Enter")) {
            String s1 = t1.getText();
            //assigning values to the another text boxes
            t2.setText(s1);
            t3.setText("MCA");
            t4.setText("Lovely Professional University");
        }
    }

    public static void main(String args[]) {
        new Student();
    }
}