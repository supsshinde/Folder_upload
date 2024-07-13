//Two dimensional array
import java.util.*;
class TwoDArray
{
 int m[][],size,value;
 void SetValue(int m[][],int value,int size)
 {
  this.m=m;
  this.size=size;
  this.value=value;
 }
 void GetValue()
 {
	 boolean b=false;
	 int count=0;
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			if(m[i][j]==value)
			{
				count++;
				b=true;
			}
		}
	}
   if(b==true)
   {
	   System.out.println("The count is " +count);
   }	   
   else
   {
	   System.out.println("No element found");
   }
 }
}
public class TwoDQuestion
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		
		System.out.println("Enter value for count");
		int value=sc.nextInt();
		
		int a[][]=new int[size][size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		TwoDArray T=new TwoDArray();
		T.SetValue(a,value,size);
		T.GetValue();
	}
}