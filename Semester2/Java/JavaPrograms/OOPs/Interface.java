package OOPs;

interface A1{
    void fun1();
}

interface A2{
    void fun2();
}

class B1 implements A1, A2{
    @Override
    public void fun1(){
        System.out.println("func 1 from B1");
    }

    @Override
    public void fun2(){
        System.out.println("func 2 from B1");
    }
}

public class Interface {
    public static void main(String[] args) {
        int b = 0;
        B1 b1 = new B1();
        b1.fun1();
        b1.fun2();
    }
}
