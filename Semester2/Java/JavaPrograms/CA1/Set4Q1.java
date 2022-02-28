package CA1;

import java.util.Scanner;

class Student{
  String name;
  double marks[];

  Student(String s_name, double[] ca_marks){
    name = s_name;
    marks = ca_marks;
  }

  private double getAvg(double[] m){
    double avg = 0;
    double best1 = m[0];
    double best2 = m[1];

    if(best1<best2){
      double temp=best1;
      best1 = best2;
      best2 = temp;
    }
    for(int i=2; i<m.length;i++){
      if(best1 < m[i]){
        best2=best1;
        best1 = m[i];
      }
      else if(best2 < m[i] && m[i]!=best1){
        best2 = m[i];
      }
    }
    return (best1+best2)/2;
  }
  public void display(){
    System.out.println("Name: "+name);
    System.out.println("Avg of best 2 marks: "+getAvg(marks));
    System.out.println();
  }
}

public class Set4Q1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Student[] obj = new Student[5];

      for(int o=0; o<5; o++){
        String st_name;
        double ca_marks[] = {0,0,0};
        System.out.print("Student"+(o+1)+" name:");
        st_name = sc.next();
        for(int i=0; i<3; i++){
          System.out.print("CA"+(i+1)+": ");
          ca_marks[i] = sc.nextDouble();
        }
        obj[o] = new Student(st_name, ca_marks);
      }

      System.out.println("Calculating avg of best 2 marks.");
      for(int o=0; o<5; o++){
        obj[o].display();
      }
    }
}
