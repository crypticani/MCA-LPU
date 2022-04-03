// A program to find sum of a matrix and store in another array.

import java.util.Scanner;

public class MatrixSum1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter row: ");
            int row = sc.nextInt();
            System.out.print("Enter coloum: ");
            int col = sc.nextInt();
            int arr[][] = new int[row][col];
            int sum[] = new int[col] ;
            
            System.out.println("Enter numbers: ");
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<row; i++){
                int temp = 0;
                for(int j=0; j<col; j++){
                    temp = temp + arr[i][j];
                }
                sum[i] = temp;
            }

            //displaying sum
            for(int i=0; i<col; i++){
                System.out.print(sum[i]+ " ");
            }
        }
    }
}
