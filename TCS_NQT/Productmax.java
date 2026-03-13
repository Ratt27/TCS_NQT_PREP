//give the maximum product problem
import java.util.*;
public class Productmax
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the range");
int n=sc.nextInt();
int[] arr= new int[n];
System.out.println("enter the numbers");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);

int product1= arr[n-1]*arr[n-2]*arr[n-3];
int product2=arr[0]*arr[1]*arr[n-1];

int max=Math.max(product1,product2);
System.out.println(max);
}
}
