//Find ceiling and floor of sorted array
import java.util.*;
class FindCeiling
{
	int size,m[],value;
	void setValue(int m[],int size,int value)
	{
		this.size=size;
		this.m=m;
		this.value=value;
	}
	void getValue()
	{
		int ceil=0,f=0;
		for(int i=0;i<size;i++)
		{
			if(value<m[0])
			{
				ceil=m[0];
				f=-1;
			}
			if(value==m[i])
			{
				ceil=m[i];
				f=m[i];
			}
			if(value>m[size-1])
			{
				ceil=-1;
				f=m[size-1];
			}
				for(int j=i+1;j<size-1;j++)
				{
			      if(value>m[i] && value<m[j])
			      {
				   ceil=m[j];
				   f=m[i];
				   break;
			      }
				}
		}
		System.out.println("Ceiling is " +ceil);
		System.out.println("Floor is " +f);
	}
}
public class CeilingAndFloor
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of array");
   int size=sc.nextInt();
   
   System.out.println("Enter value to find ceiling and floor");
   int C=sc.nextInt();
   
   int a[]=new int[size];
   System.out.println("Element in array");
   for(int i=0;i<size;i++)
   {
	   a[i]=sc.nextInt();
   }	 
   FindCeiling F=new FindCeiling();
   F.setValue(a,size,C); 
   F.getValue();
 }
}