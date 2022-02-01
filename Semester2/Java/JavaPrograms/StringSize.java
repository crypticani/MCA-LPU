// A program to take recieve input and calculate the size of string

import java.util.Scanner;


public class StringSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = sc.nextLine();

        System.out.println("Length of string: "+ str.length());
    }
}
