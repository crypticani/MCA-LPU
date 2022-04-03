package CA1;

import java.util.Scanner;
import java.awt.Color;

public class Set8Q2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter color value:");
            String col = sc.next();
            Color.decode(col);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
