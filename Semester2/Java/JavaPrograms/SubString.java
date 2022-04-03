// A program to recieve string and sub string from the user and find out whether the sub string exist in string or not.

import java.util.Scanner;


public class SubString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            System.out.print("Enter the Sub-string: ");
            String subString = sc.nextLine();

            if(str.contains(subString)){
                System.out.println("String Contains the given sub string.");
            }
            else{
                System.out.println("String does NOT Contain the given sub string.");
            }
        }

    }
}
