//Mirror
import java.util.*;
public class Mirror2
{
    public static void main(String args[])
    {
        System.out.println("enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            char c = (char)('Z' - (str.charAt(i) - 'A'));
            result += c;
        }

        System.out.println(result);
    }
}