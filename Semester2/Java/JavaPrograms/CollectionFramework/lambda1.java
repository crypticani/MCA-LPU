package CollectionFramework;

interface Transaction1 {
    void deposit(int amount);
}

interface Transaction2 {
    void withDraw(int amount);
}

public class lambda1 {
    public static void main(String[] args) {
        Transaction1 ob1 = (int amount) -> // Lambda Exp.
        {
            System.out.println("Amount deposited " + amount);
        };

        Transaction2 ob2 = (int amount) -> // Lambda Exp.
        {
            System.out.println("Amount withdrawn " + amount);
        };

        ob1.deposit(1000);
        ob2.withDraw(1000);

    }

}
