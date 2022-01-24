// A program to print fibonacci series upto n terms

import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

		int a = 0, b = 1, n;

        System.out.println("Enter the no of terms: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
	}
}
