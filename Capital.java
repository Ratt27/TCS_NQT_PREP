// CHECK capitalism
import java.util.*;
public class Capital
{
public static boolean allCapital( String str)
{
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)<'A'|| str.charAt(i)>'Z')
return false;
}
return true;
}

public static boolean allSmall( String str)
{

for(int i=0;i<str.length();i++)
{
if(str.charAt(i)<'a'|| str.charAt(i)>'z')
return false;
}
return true;
}
public static void  main(String args[])
{
Scanner sc= new Scanner(System.in);
 String str=sc.nextLine();
if(allCapital(str)||allSmall(str)|| allSmall(str.substring(1)))
System.out.println(true);
else
System.out.println(false);

}
}