public class ForEach {
    public static void main(String args[]) {
      int sum = 0;
      int marks[][] = { { 28, 27, 29 }, { 26, 28, 29 }, { 27, 29, 30 } };
  
      for (int x[] : marks) {
        System.out.println("Marks of Subject ");
        for (int y : x) {
          System.out.println("Marks is: " + y);
          sum += y;
        }
      }
      System.out.println("Total Marks: " + sum);
    }
  }
  