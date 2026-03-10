//Combination
import java.util.*;
public class Combination
{
public static int fact(int n)
{
int factorial=1;
for(int i=2;i<=n;i++)
{
factorial=factorial*i;
}
return factorial;
}
public static void main(String args[])
{
System.out.println("Enter the number of employees");
Scanner sc= new Scanner(System.in);
int N=sc.nextInt();
System.out.println("Enter the number of employees per team");
 int R=sc.nextInt();

int fact= fact(N)/(fact(R) * fact(N-R));

System.out.println(fact);
}
}