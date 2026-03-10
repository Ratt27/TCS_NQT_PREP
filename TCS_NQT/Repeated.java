import java.util.*;
public class Repeated
{
public static char Solution(String s)
{
Map<Character,Integer> map= new HashMap<>();

// putting the charactrs in the hashmap
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
map.put(ch,map.getOrDefault(ch,0)+1);
}


// finding first non repeating character
for(int i=0;i<s.length();i++)
{
char ch= s.charAt(i);
if(map.get(ch)==1)
return ch;
}

 return '\0';
}
public static void main(String args[])
{
 System.out.println("enter your string");
Scanner sc= new Scanner(System.in);
String s= sc.nextLine();
System.out.println(Solution(s));
}

}
