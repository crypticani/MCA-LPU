package CA1;

import java.util.Scanner;
import java.awt.Color;

public class Set8Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color value:");
        String col = sc.next();
        Color.decode(col);
        }
    }
