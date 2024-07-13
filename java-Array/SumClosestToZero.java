//Find two elements whose sun is closest to zero
import java.util.*;
import java.math.*;
class Sum
{
	int m[],size;
	void setValue(int m[],int size)
	{
		this.m=m;
		this.size=size;
	}
	void getValue()
	{
		int sum=0,l=0,r=0;
		int smallest=m[0]+m[1];
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				sum=m[i]+m[j];
				if(Math.abs(smallest)>Math.abs(sum))
				{
					smallest=sum;
					l=i;
					r=j;
				}
			}
		}
	 System.out.println("Sum of closest to zero element is " +m[l]+ " " +m[r]);	
	}
}
public class SumClosestToZero
{
 public static void main(String x[])
 {
   int size;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of array");
   size=sc.nextInt();
   
   int a[]=new int[size];
   System.out.println("Element in array");
   for(int i=0;i<size;i++)
   {
	   a[i]=sc.nextInt();
   }	 
   Sum G=new Sum();
   G.setValue(a,size); 
   G.getValue();
 }
}