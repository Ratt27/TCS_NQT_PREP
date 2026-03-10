import java.util.*;

public class placeValue
{
    public static int getFirst(int arr[], int target)
    {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target)
            {
                result = mid;
                high = mid - 1;   // move left to find earlier occurrence
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int getLast(int arr[], int target)
    {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target)
            {
                result = mid;
                low = mid + 1;   // move right to find later occurrence
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int first = getFirst(arr, target);
        int last = getLast(arr, target);

        System.out.println("First position: " + first);
        System.out.println("Last position: " + last);

        sc.close();
    }
}