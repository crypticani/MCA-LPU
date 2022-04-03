// A program to print series of tables as per the range given by user

import java.util.Scanner;

public class SeriesOfTables {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m, n;

            System.out.println("Enter the lower range: ");
            m = sc.nextInt();

            System.out.println("Enter the upper range: ");
            n = sc.nextInt();
            for(int i=m; i<=n; i++){
                for(int j = 1; j<=10; j++){
                    System.out.print(i*j+ " ");
                }
                System.out.println();
            }
        }
    }
}
