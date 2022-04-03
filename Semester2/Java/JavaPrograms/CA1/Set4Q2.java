package CA1;

import java.util.Scanner;

class ShippingCompany{
    public double getCharges(double w, double d){
        double charges=0;
        if(w>0 && w<=2){
            charges = 1.10*((int)(d/500)+1);
        }
        else if(w>2 && w<=6){
            charges = 2.20*((int)(d/500)+1);
        }
        else if(w>6 && w<=10){
            charges = 3.70*((int)(d/500)+1);
        }
        else if(w>10 && w<=20){
            charges = 4.80*((int)(d/500)+1);
        }
        else{
            System.out.println("Invalid weight!");
        }
        return charges;
    }
}

public class Set4Q2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double Weight, distance, charges;

            System.out.println("Welcome to Fast Freight Shipping Company");
            System.out.print("Enter Weight of package: ");
            Weight = sc.nextDouble();
            System.out.print("Enter distance to be shipped: ");
            distance =sc.nextDouble();

            if(distance<10 || distance>3000){
                System.out.println("Invalid distance!");
            }
            else if(Weight<0 || Weight>20){
                System.out.println("Invalid weight!");
            }
            else{
                ShippingCompany ship = new ShippingCompany();
                charges = ship.getCharges(Weight, distance);
                System.out.println("Charges: $"+charges);
            }
        }
    }
}
