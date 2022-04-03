import java.util.Scanner;

public class Calculator {
    public static int addition(int x, int y){
        return x+y;
    }
    public static int division(int x, int y){
        return x/y;
    }
    public static int subtraction(int x, int y){
        return x-y;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int add = addition(a, b);
            int div = division(a, b);
            int sub = subtraction(a, b);
            System.out.println("Addition: "+add);
            System.out.println("Division: "+div);
            System.out.println("Subtraction: "+sub);
        }
    }
}
