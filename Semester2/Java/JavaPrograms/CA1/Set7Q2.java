package CA1;

import java.util.Scanner;

class Time{
    int hours=24;
    int minutes=24*60;
    int seconds=24*60*60;

    public void hourConvertor(int day){
        int total_hours;
        total_hours = day*hours;
        System.out.println("total_hours:"+total_hours);
    }

    public void minConvertor(int day){
        int total_mins;
        total_mins = day*minutes;
        System.out.println("total_mins:"+total_mins);
    }

    public void secConvertor(int day){
        int total_secs;
        total_secs = day*seconds;
        System.out.println("total_secs:"+total_secs);
    }
}

public class Set7Q2 {
    public static int getDays(){
        Scanner sc = new Scanner(System.in);
        int d;
        System.out.print("Days: ");
        d = sc.nextInt();
        return d;
    }

    public static void main(String[] args) {
        System.out.println("A program to convert days into hours, minutes and seconds.");
        int days = getDays();
        Time t = new Time();
        t.hourConvertor(days);
        t.minConvertor(days);
        t.secConvertor(days);
    }
    
}
