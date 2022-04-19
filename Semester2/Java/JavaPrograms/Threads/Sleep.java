package Threads;

import java.util.*;

public class Sleep {

    static String str;
    char c[] = str.toCharArray();
    char d[] = new char[10];

    public void printFirst() {
        synchronized (this) {
            int j = 0;
            for (int i = 0; i < c.length; i++) {
                // Logic to implement first character of each word in a string
                if (c[i] != ' ' && (i == 0 || c[i - 1] == ' ')) {
                    System.out.print(c[i] + " ");
                    d[j] = c[i + 1];
                    j++;
                }
            }
            notify();
        }
    }

    public void printSecond() {
        synchronized (this) {
            try {
                Thread.sleep(1000);
                System.out.println();
                for (int i = 0; i < d.length; i++) {
                    System.out.print(d[i] + " ");
                }

            } catch (Exception e) {

                // catching the exception
                System.out.println(e);
            }

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        str = sc.nextLine();
        // Create an object of class
        Sleep mt = new Sleep();

        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printFirst();
            }
        });

        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printSecond();
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}