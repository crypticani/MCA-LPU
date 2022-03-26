package Swing;

import javax.swing.*;

public class Swing1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();// creating instance of JFrame

        JButton b1 = new JButton("CAP615-TH");// creating instance of JButton
        b1.setBounds(130, 100, 150, 40);// x axis, y axis, width, height

        JButton b2 = new JButton("CAP680-LB");// creating instance of JButton
        b2.setBounds(130, 200, 150, 40);// x axis, y axis, width, height

        f.add(b1);// adding button in JFrame
        f.add(b2);// adding button in JFrame

        f.setSize(400, 500);// 400 width and 500 height
        f.setLayout(null);// using no layout managers
        f.setVisible(true);// making the frame visible
    }
}