// Half Pyramid with numbers
// HPyramid-- Pattern printing
 import java.util.*;
public class HPyramid2
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
 for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++ )
{
System.out.print(j);
}
System.out.println();
}
}
}