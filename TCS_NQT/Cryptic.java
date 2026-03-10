//Cryptic Number
import java.util.*;
public class Cryptic
{
    public static Boolean palindrome(int n)
    {
        int original = n;
        int rev = 0;

        while(n > 0)
        {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return original == rev;
    }

    public static Boolean repeated(int n)
    {
        int[] freq = new int[10];

        while(n > 0)
        {
            int digit = n % 10;

            if(freq[digit] == 1)
                return true;

            freq[digit] = 1;
            n = n / 10;
        }

        return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        boolean found = false;

        for(int i = L; i <= R; i++)   // inclusive range
        {
            if(i % 7 != 0)
                continue;

            if(i % 5 == 0)
                continue;

            if(palindrome(i))   // must NOT be palindrome
                continue;

            if(repeated(i))
                continue;

            System.out.println(i);
            found = true;
        }

        if(!found)
            System.out.println(-1);
    }
}