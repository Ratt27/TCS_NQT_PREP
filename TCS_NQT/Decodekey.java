//Decodekey
import java.util.*;
public class DecodeKey
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);

// take input for key letters
String keyline=sc.nextLine();
String[] keys=keyline.split(" ");

// take input for encrypted numbers
String numline= sc.nextLine();
String[] nums=numline.split(" ");

int n=nums.length;
for(int i=0;i<keys.length;i++)
{
int keyval= keys[i].charAt(0)-'A'+1;
 Boolean valid= true;
String result="";
for(int j=0;j<n;j++)
{
int val=Integer.parseInt(nums[j]);
int p=val-keyval;

if(p<1||p>26)
{
valid=false;
break;
}
char ch=(char)('A'+p-1);
result=result+ ch;
}
if(valid)
{
System.out.println(result);
break;
}
}
}
}