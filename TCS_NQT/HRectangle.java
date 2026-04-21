// Hollow Rectangle-- Pattern printing
 import java.util.*;
public class HRectangle
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
for(int j=0;j<n;j++ )
{
if(i==0||i==m-1||j==0||j==n-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}