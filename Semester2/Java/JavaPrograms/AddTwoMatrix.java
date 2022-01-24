// A program to add two matix

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter coloum: ");
        int col = sc.nextInt();
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        int sum[][] = new int[row][col] ;
        
        //getting input of first matrix
        System.out.println("Enter numbers of first matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        //getting input of second matrix
        System.out.println("Enter numbers of second matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        //adding two matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        //displaying the sum matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

