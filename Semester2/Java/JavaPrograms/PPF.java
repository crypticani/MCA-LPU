import java.util.Scanner;

public class PPF {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double yearlyamount,q_amount,installment,rate;

        System.out.println("Enter installment amount: ");
        installment = sc.nextDouble();

        System.out.println("Enter rate of interest: ");
        rate = sc.nextDouble();

        q_amount = 3*(installment+(rate/100)*installment);
        yearlyamount = installment*(1+(rate));

        System.out.println("Quaterly Amount:"+q_amount);
        System.out.println("yearly amount:"+yearlyamount);


    }
    
}
