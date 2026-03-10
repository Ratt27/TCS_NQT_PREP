//Single Integer
import java.util.*;
public class Singleint
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
// here space complexity is:: O(n)
HashMap<Integer,Integer> map= new HashMap<>();
for(int i=0;i<n;i++)
{
map.put(arr[i],map.getOrDefault(arr[i],0)+1);
}
int res=0;
for(int i=0;i<n;i++)
{
if(map.get(arr[i])==1)
{
 res=arr[i];
break;
}
}
System.out.println(" first single integer here is : "+res);
}
}