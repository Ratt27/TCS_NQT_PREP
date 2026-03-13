//shoe problem
import  java.util.*;
public class CorrectShoe
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.println(" enter the String");
String str=sc.nextLine();
String[] arr=str.split(" ");

HashMap<Integer,Integer> hash1 = new HashMap<>();
HashMap<Integer,Integer> hash2 = new HashMap<>();

for(int i=0;i<arr.length;i++)
{
int size=arr[i].charAt(0)-'0';
char side=arr[i].charAt(1);

if(side=='L')
hash1.put(size,hash1.getOrDefault(hash1,0)+1);
else
hash2.put(size,hash2.getOrDefault(hash2,0)+1);
}
int pairs=0;
for(int key:hash1.keySet())
{
if(hash2.containsKey(key))
pairs+=Math.min(hash1.get(key),hash2.get(key));
}
System.out.println("pairs:  "+pairs);
}

}