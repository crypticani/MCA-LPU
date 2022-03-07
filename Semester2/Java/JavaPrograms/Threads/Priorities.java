package Threads;

class Myclass extends Thread {
    int count = 0;

    public void run() {
        for (int i = 1; i <= 10000; i++)
            count++;

        System.out.println("Completed Thread: " + Thread.currentThread().getName());
        System.out.println("Its priority: " + Thread.currentThread().getPriority());
    }
}

class Priorities {
    public static void main(String args[]) {
        Myclass obj = new Myclass();

        Thread t1 = new Thread(obj, "One");
        Thread t2 = new Thread(obj, "Two");

        t1.setPriority(2);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
    }
}