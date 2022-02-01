// A program to find the diagonal sum of a matrix 

import java.util.Scanner;

public class MatrixSumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter no of coloumns: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int sum[] = new int[2] ;
        
        System.out.println("Enter numbers: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // //calculating sum using two loops
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         if(i==j){ //left to right diagonal
        //             sum[0]+=arr[i][j];
        //         }
        //         else if(i+j == col-1){ //right to left diagonal
        //             sum[1]+=arr[i][j];
        //         }
        //     }
        // }

        //calculating sum using single loop
        for(int i=0; i<col; i++){
            sum[0]+=arr[i][i];  //left to right diagonal
            sum[1]+=arr[i][col-i-1];  //right to left diagonal
        }

            System.out.print(sum[1]+ " " +sum[0]);
    }
}
