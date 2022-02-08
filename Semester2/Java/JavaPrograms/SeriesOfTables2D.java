import java.util.Scanner;

class SeriesOfTables2D{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int sn, en, n, r, rows, tr=0;
System.out.println("Enter the starting of range:");
sn=sc.nextInt();
System.out.println("Enter the ending of range:");
en=sc.nextInt();
rows=(en-sn)+1;

int a[][]=new int[rows][10];

for(r=sn; r<=en; r++)
{
for(n=1; n<=10; n++)
{
a[tr][n-1]=(r*n);
}
tr++;
}
for(r=0; r<rows; r++)
{
for(n=0; n<10; n++)
{
System.out.print(a[r][n]+" ");
}
System.out.println();
}

}
}
