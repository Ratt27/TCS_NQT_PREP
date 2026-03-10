//Single integr method 2: space complexity--> O(1)
import java.util.*;
public class Singleint2
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the no of integers");
int n=sc.nextInt();
int[] arr= new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int XOR=0;
for(int nums:arr)
{
XOR= XOR^nums;
}
System.out.println(" first single integer here is : "+XOR);
}
}