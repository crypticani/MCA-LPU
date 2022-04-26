package Swing;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class ColorTextBox {
    JFrame f;
    JLabel l0;
    JTextField t1;
    JTextArea ta;
    JButton b1;

    ColorTextBox() {
        f = new JFrame("ColorTextBox");

        l0 = new JLabel("Choose Color:");
        l0.setBounds(40, 50, 200, 30);
        f.add(l0);

        String colors[] = { "RED", "BLUE", "GREEN", "YELLOW","BLACK"};
        final JComboBox cb = new JComboBox(colors);
        cb.setBounds(200, 50, 100, 20);
        f.add(cb);

        JButton b = new JButton("Show");
        b.setBounds(200, 100, 75, 20);
        f.add(b);

        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        f.add(t1);


        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str = (String) cb.getItemAt(cb.getSelectedIndex());
                t1.setText(str);
                if(str.equals("RED")){
                    t1.setBackground(Color.RED);
                }
                else if(str.equals("BLUE")){
                    t1.setBackground(Color.BLUE);
                }
                else if(str.equals("GREEN")){
                    t1.setBackground(Color.GREEN);
                }
                else if(str.equals("YELLOW")){
                    t1.setBackground(Color.YELLOW);
                }
                else if(str.equals("BLACK")){
                    t1.setBackground(Color.BLACK);
                }
            }
        });
    }

    public static void main(String args[]) {
        new ColorTextBox();
    }
}
