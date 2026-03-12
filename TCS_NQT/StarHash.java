//starhash
import java.util.*;

public class StarHash
{
    public static void main(String args[])
    {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count1 = 0; // count of #
        int count2 = 0; // count of *

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '#')
                count1++;

            if(s.charAt(i) == '*')
                count2++;
        }

        System.out.println(count2 - count1);
    }
}