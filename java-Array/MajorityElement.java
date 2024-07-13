//Majority element from array
import java.util.*;
class Majority
{
	int m[],size;
	void setValue(int m[],int size)
	{
		this.size=size;
		this.m=m;
	}
	void getValue()
	{
		int count=1,flag=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(m[i]==m[j])
				{
					count++;

					if(count>size/2)
					{
						System.out.println("majority element is "+m[i]);
						flag=1;
					}
				  break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("Their is no majority element in array");
		}
	}
}
public class MajorityElement
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
   Majority M=new Majority();
   M.setValue(a,size); 
   M.getValue();
 }
}