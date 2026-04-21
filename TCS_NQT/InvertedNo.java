// Inverted Half Pyramid with numbers
// HPyramid-- Pattern printing
 import java.util.*;
public class InvertedNo
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
 for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++ )
{
System.out.print(j);
}
System.out.println();
}
}
}