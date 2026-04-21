// Inverted Pyramid-- Pattern printing
 import java.util.*;
public class InvertedP
{
 public static void main(String args[])
{
int m;
int n;
Scanner sc= new Scanner(System.in);
System.out.println("enter the no of rows");
m=sc.nextInt();
System.out.println("enter the no of columns");
n=sc.nextInt();
 for(int i=0;i<m;i++)
{
for(int j=n-1;j>i;j-- )
{
System.out.print("*");
}
System.out.println();
}
}
}