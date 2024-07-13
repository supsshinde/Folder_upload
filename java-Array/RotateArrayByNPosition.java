//Rotate an array by N positions
import java.util.*;
class Rotate
{
	int size,pos,m[];
	void setValue(int size,int m[],int pos)
	{
		this.size=size;
		this.m=m;
		this.pos=pos;
	}
	void getValue()
	{
		for(int i=0;i<pos;i++)
		{
			int temp=m[0];
			for(int j=0;j<size-1;j++)
			{
			 m[j]=m[j+1];
			}
		 m[size-1]=temp;	
		}	
	 System.out.println("After rotation ");
	 for(int i=0;i<size;i++)
	 {
		System.out.println(m[i]);
	 }
	}
}
public class RotateArrayByNPosition
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter size of array");
   int size=sc.nextInt();
   
   System.out.println("Enter the position to rotate array");
   int pos=sc.nextInt();
  
   int a[]=new int[size+1];
   System.out.println("Element in array");
   for(int i=0;i<size;i++)
   {
	  a[i]=sc.nextInt();
   }	 
 Rotate R=new Rotate();
 R.setValue(size,a,pos); 
 R.getValue();
 }
}