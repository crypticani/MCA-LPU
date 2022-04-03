package CA1;

import java.util.Scanner;

class Matrix{
    public void Product(int row, int col, int arr1[][], int arr2[][]){
        //multiplying two matrix
        int product[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                for(int k=0; k<row; k++){
                    product[i][j] = product[i][j] + arr1[i][k]*arr2[k][j];
                }
            }
        }
        
        //displaying the product of matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(product[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

public class Set4Q3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no of row: ");
            int row = sc.nextInt();
            System.out.print("Enter no of coloum: ");
            int col = sc.nextInt();
            int arr1[][] = new int[row][col];
            int arr2[][] = new int[row][col];
            
            //getting input of first matrix
            System.out.println("Enter elements of first matrix: ");
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    arr1[i][j] = sc.nextInt();
                }
            }

            //getting input of second matrix
            System.out.println("Enter elements of second matrix: ");
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    arr2[i][j] = sc.nextInt();
                }
            }

            System.out.println("Product:");
            Matrix m = new Matrix();
            m.Product(row, col, arr1, arr2);
        }
    }
}
