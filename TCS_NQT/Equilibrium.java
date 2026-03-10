import java.util.*;

public class Equilibrium
{
    public static int Solution(int arr[])
    {
        int sum = 0;

        // Total sum
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        int ls = 0;

        // Check equilibrium index
        for(int i = 0; i < arr.length; i++)
        {
            int rs = sum - ls - arr[i];

            if(rs == ls)
            {
                return i;
            }

            ls += arr[i];
        }

        return -1; // if no equilibrium index
    }

    public static void main(String args[])
    {
        System.out.println("Enter the number of elements:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equilibrium index: " + Solution(arr));

        sc.close();
    }
}