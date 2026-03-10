//Sunday plan
import java.util.*;
public class Sunday
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String day = sc.nextLine();
int n=sc.nextInt();
HashMap<String,Integer> map= new HashMap<>();
map.put("Sunday",0);
map.put("Monday",1);
map.put("Tuesday",2);
map.put("Wednesday",3);
map.put("Thursday",4);
map.put("Friday",5);
map.put("Saturday",6);

int start=map.get(day);

// modulus is done to keep it within range

int firstSunday=(7-start)%7;
int ans=0;
if(firstSunday<n)
{
ans=1+(n-firstSunday-1)/7;
}
System.out.println(ans);
}
}