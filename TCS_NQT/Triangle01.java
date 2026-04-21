// 0-1's Triangle

 import java.util.*;
public class Triangle01
{
 public static void main(String args[])
{
int m;
int number=1;
Scanner sc= new Scanner(System.in);
System.out.println("enter the no of rows");
m=sc.nextInt();
 for(int i=1;i<=m;i++)
{
for(int j=1;j<=i;j++ )
{
int sum=i+j;
if(sum%2==0)
System.out.print('1');
else
System.out.print('0');
}
System.out.println();
}
}
}