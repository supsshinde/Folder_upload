//Remove duplicate elements from array
import java.util.*;
class RemoveDuplicate
{
  int m[],size;	
  void setArray(int size, int a[])
  {
    m=a;
	this.size=size;
  }
   int getSortArray()
   {
     for(int i=0;i<size;i++)
	 {
		for(int j=i+1;j<size;j++)
		{
			if(m[i]==m[j])
			{
				for(int k=j;k<size-1;k++)
				{
				 m[k]=m[k+1];
				}
		     size--;	
		     j--;
			}
		}			
	 }
	 return size;
   }
}
public class RemoveDuplicateFromArray
{
  public static void main(String x[])
  {
	  int size;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter size of array");
	  size=sc.nextInt();
	  int a[]=new int [size];
	  System.out.println("Enter elements of array");
	  for(int i=0;i<size;i++)
	  {
		 a[i]=sc.nextInt(); 
	  }
  RemoveDuplicate R=new RemoveDuplicate();
  R.setArray(size,a); 
  
  int size1=R.getSortArray();
  
  System.out.println("After removing duplicate elements from array");
  for(int i=0;i<size1;i++)
  {
	System.out.println(a[i]);  
  }	  
  }  
}