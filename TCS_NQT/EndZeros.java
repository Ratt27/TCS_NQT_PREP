// Removing zeros to the end
import java.util.*;

public class EndZeros
{

    public static void Solution(int[] arr, int n)
    {
        int j = 0;   // position to place next non-zero

        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
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

        Solution(arr, n);

        System.out.println("Array after moving zeros to end:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}