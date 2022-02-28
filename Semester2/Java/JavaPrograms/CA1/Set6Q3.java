package CA1;

class Stock{
    public void calculateAmount(){
        double shares = 600;
        double price = 20;
        double commission = 2.00/100;
        double amount = shares * price;
        double commission_amount = commission*amount;
        double total_amount = amount+commission_amount;
        
        System.out.println("Amount without commision: Rs."+amount);
        System.out.println("Amount of commission: Rs."+commission_amount);
        System.out.println("Total amount paid: Rs."+total_amount);
    }
}
public class Set6Q3 {
    public static void main(String[] args) {
        Stock r = new Stock();
        r.calculateAmount();
    }
}
