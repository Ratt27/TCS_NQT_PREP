// Half Pyramid
// HPyramid-- Pattern printing
 import java.util.*;
public class HPyramid
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
for(int j=0;j<=i;j++ )
{
System.out.print("*");
}
System.out.println();
}
}
}