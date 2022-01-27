package OOPs;

class A1{
    public void fun1(){
        System.out.println("Function from class A1");
    }
}
    
class B1 extends A1{
    public void func2(){
        System.out.println("Function from class B1");
    }
}
    
class B2 extends A1{
    public void func3(){
        System.out.println("Function from class B2");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        A1 a1 = new A1();
        B1 b1 = new B1();
        B2 b2 = new B2();
        a1.fun1();

        b1.fun1();
        b1.func2();

        b2.fun1();
        b2.func3();
    }
}
