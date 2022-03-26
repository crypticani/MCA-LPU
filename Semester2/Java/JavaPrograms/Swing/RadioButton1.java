package Swing;

import javax.swing.*;

class RadioButton1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JRadioButton r1 = new JRadioButton("A) Male");
        JRadioButton r2 = new JRadioButton("B) Female");
        JRadioButton r3 = new JRadioButton("A) Graduate");
        JRadioButton r4 = new JRadioButton("B) Post-Graduate");

        r1.setBounds(75, 50, 100, 30);
        r2.setBounds(75, 100, 100, 30);
        r3.setBounds(75, 150, 100, 30);
        r4.setBounds(75, 200, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(r3);
        bg2.add(r4);

        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

    }
}