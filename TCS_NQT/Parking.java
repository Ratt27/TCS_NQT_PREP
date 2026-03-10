//Parking space
import java.util.*;
public class Parking
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the row no");
int R=sc.nextInt();
System.out.println("enter the coloumn no");
int C= sc.nextInt();
int[][] matrix= new int[R][C];
for(int i=0;i<R;i++)
{
for(int j=0;j<C;j++)
{
matrix[i][j]=sc.nextInt();
}
}

int max=0;
int row=-1;
for(int i=0;i<R;i++)
{
int count=0;
for(int j=0;j<C;j++)
{
if(matrix[i][j]==1)
{
count++;
}
if(count>max)
{
max=count;
row=i;
}
}
}

System.out.println("row having maximum parking space :"+row);
}

}