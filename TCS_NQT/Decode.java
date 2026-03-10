//Kingdecode
import java.util.*;
public class Decode
{
public static String Solution(String s, char key)
{

int keyVal= key-'A'+1;
String result="";
for(int i=0;i<s.length();i++)
{
int val=(s.charAt(i)-'A'+1)+keyVal;
val=val%26;
if(val==0)
val=26;
char ch=(char)('A'+ val-1);
result=result+ch;
}

return result;
}

public static void main(String args[])
{
System.out.println("enter the String");
Scanner sc= new Scanner(System.in);
String s=sc.nextLine().toUpperCase();
System.out.println("enter the key");
char key=sc.nextLine().toUpperCase().charAt(0);
System.out.println(Solution(s,key));
}
}