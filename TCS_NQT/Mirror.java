//Mirror fragment
import java.util.*;
public class Mirror
{
public static String Solution(String s)
{
int start=0;
int maxlen=1;

//odd length palindrome
for(int i=0;i<s.length();i++)
{
int l=i;
int r=i;
while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
{
if(r-l+1>maxlen)
{
start=l;
maxlen=r-l+1;
}
l--;
r++;
}

//even length palindrome
l=i;
r=i+1;
while(l>=0&& r<s.length() && s.charAt(l)== s.charAt(r))
{
 if(r-l+1>maxlen)
{
start=l;
maxlen=r-l+1;
}
l--;
r++;
}
}
return s.substring(start,start+maxlen);
}

public static void main(String args[])
{
System.out.println("enter the String");
Scanner sc= new Scanner(System.in);
String s=sc.nextLine();
System.out.println(Solution(s));
}
}