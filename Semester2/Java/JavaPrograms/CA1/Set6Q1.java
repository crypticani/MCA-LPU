package CA1;

class Restaurant{
    public void calculateBill(int meal_charge){
        double meal_cost = meal_charge;
        double tax = 6.75/100*meal_cost;
        double tip = 15.00/100*meal_cost;

        double total_bill = meal_cost+tax+tip;

        System.out.println("Bill: ");
        System.out.println("meal cost: Rs."+meal_cost);
        System.out.println("tax amount: Rs."+tax);
        System.out.println("tip: Rs."+tip);
        System.out.println("Total bill: Rs."+total_bill);
    }
}
public class Set6Q1 {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.calculateBill(45);
    }
}
