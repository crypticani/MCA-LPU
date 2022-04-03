package CA1;

import java.util.Scanner;

class BookSeller{
    public int Reward(int books){
        if(books == 0){
            return 0;
        }
        else if(books==1){
            return 5;
        }
        else if(books==2){
            return 15;
        }
        else if(books==3){
            return 30;
        }
        else if(books>=4){
            return 60;
        }
        else{
            return -1;
        }
    }
}
public class Set6Q2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to reward club!");
            System.out.print("Enter the number of books purchased:");
            int n = sc.nextInt();

            BookSeller b = new BookSeller();
            int reward = b.Reward(n);

            if(reward == -1){
                System.out.println("Invalid Input!");
            }
            else{
                System.out.println("Reward Points: "+reward);
            }
        }
    }
    
    
}
