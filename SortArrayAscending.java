//Sort array
import java.util.*;
class SortArr
{
  int m[];
  int size;
  void setArray(int m[], int size)
  {
	 this.size=size;
     this.m=m;	 
  }
  int[] getSortArray()
  {
	 int temp;
     for(int i=0;i<size;i++)
	 {
		 for(int j=0;j<size;j++)
		 {
			if(m[i]>m[j])
            {
			  temp=m[i];
              m[i]=m[j];
              m[j]=temp;			  
			}				
		 }
	 }		 
	 return m;
  }
}
public class SortArrayAscending
{
	public static void main(String x[])
	{
	  int size;
	  System.out.println("Enter size of array");
      size=sc.nextInt();
	  System.out.println("Enter array elements");
	  int a[]=new int[size];
	  for(int i=0;i<size;i++)
	  {
		a[i]=sc.nextInt();  
	  }	  
	}
	SortArr S=new SortArr();
	S.setArray(a,size);
	int m[]=S.getSortArray();
    //System.out.println("Ascending order array ");
	for(int i=0;i<size;i++)
	{
	 System.out.println(m[i]);	
	}
}