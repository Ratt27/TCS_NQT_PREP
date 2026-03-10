// BIT flip start goal to end goal
// to count thee no of ones there is inbuild function -->Integer.bitCount(n)
import java.util.*;
 public class Bitflip
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int start = sc.nextInt();
int goal= sc.nextInt();
int n=start^goal;
System.out.println(Integer.bitCount(n));

// if the function is not allowed
 int count=0;
while(n!=0)
{
n=n &(n-1);
count++;
}
System.out.println(count);
}
}
