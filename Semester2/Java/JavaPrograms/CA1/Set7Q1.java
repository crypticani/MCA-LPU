package CA1;

import java.util.Scanner;

class University{
    public void SeatAllocation(double NTS, double FSc){
        if(FSc>=70 && NTS>=70){
            System.out.println("University: Oxford University");
            System.out.println("Department: IT");
        }
        else if(FSc>=70 && NTS>=60 && NTS<70){
            System.out.println("University: Oxford University");
            System.out.println("Department: Engg");
        }
        else if(FSc>=70 && NTS>=50 && NTS<60){
            System.out.println("University: Oxford University");
            System.out.println("Department: Telecommunication");
        }
        else if(FSc>=60 && FSc<70 && NTS>50){
            System.out.println("University: MIT");
            System.out.println("Department: IT");
        }
        else if(FSc>=50 && FSc<60 && NTS>50){
            System.out.println("University: MIT");
            System.out.println("Department: Engg");
        }
        else if(FSc>=40 && FSc<50 && NTS>=40 && NTS<50){
            System.out.println("University: MIT");
            System.out.println("Department: Computer");
        }
        else{
            System.out.println("Sorry!");
        }
    }
}

public class Set7Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("University seat allocation");
        System.out.print("Enter NTS marksin percentage: ");
        double nts = sc.nextDouble();
        System.out.print("Enter FSc marks in percentage: ");
        double fsc = sc.nextDouble();

        System.out.println("You have got a seat in:");
        University u = new University();
        u.SeatAllocation(nts, fsc);
    }
}
