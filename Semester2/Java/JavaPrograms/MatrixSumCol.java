// A program to find the column wise sum of a matrix 

import java.util.Scanner;

public class MatrixSumCol {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no of rows: ");
            int row = sc.nextInt();
            System.out.print("Enter no of coloumns: ");
            int col = sc.nextInt();
            int arr[][] = new int[row][col];
            int sum[] = new int[col] ;
            
            System.out.println("Enter numbers: ");
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            //calculating sum
            for(int i=0; i<row; i++){
                int temp = 0;
                for(int j=0; j<col; j++){
                    temp = temp + arr[j][i];
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
