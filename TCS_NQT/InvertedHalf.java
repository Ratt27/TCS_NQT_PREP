// InvertedHalf Pyramid-- Pattern printing
 import java.util.*;
public class InvertedHalf
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
// first we have to print spaces
for(int j=0;j<n-i;j++ )
{
System.out.print(" ");
}

// inner loop for printing star
for(int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}