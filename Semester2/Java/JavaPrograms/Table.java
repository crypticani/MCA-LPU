// A program to print table of n number

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter the number: ");
        num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + "*" + i + " = " + num*i);
        }
    }
}
