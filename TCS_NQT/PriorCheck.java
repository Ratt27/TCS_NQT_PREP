//PriorCheck
import java.util.*;
public class PriorCheck
{
public static int Solution(int arr[], int n)
{
int maxiLeft=arr[0];
int cnt=1;
for(int i=1;i<n;i++)
{
if(arr[i]>maxiLeft)
{
cnt++;
maxiLeft=arr[i];
}
}
return cnt;
}



public static void main(String args[])
{
int n;
        System.out.println("Enter the no of elements");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

       int ans= Solution(arr,n);  
     System.out.println(ans);
}
}