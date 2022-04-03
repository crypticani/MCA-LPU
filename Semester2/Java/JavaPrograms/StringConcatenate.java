// A program to take two strings as an input and combine them

import java.util.Scanner;


public class StringConcatenate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string 1: ");
            String str1 = sc.nextLine();

            System.out.print("Enter string2: ");
            String str2 = sc.nextLine();

            System.out.print("Combined string is: "+ str1.concat(str2));
        }
    }
}
