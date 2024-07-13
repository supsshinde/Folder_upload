//Next greater element from array unsorted array
import java.util.*;
class Greater
{
	int m[],size;
	void setValue(int m[],int size)
	{
		this.size=size;
		this.m=m;
	}
	void getValue()
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(m[i]<m[j])
				{
					System.out.println(m[i]+ "----->" +m[j]);
				    break;
				}
			}
		 if(m[i]==m[size-1])
		 {
			 System.out.println(m[i]+ "------>" +(-1));
		 }
		}
	}
}
public class NextGreaterElement
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
   Greater G=new Greater();
   G.setValue(a,size); 
   G.getValue();
 }
}