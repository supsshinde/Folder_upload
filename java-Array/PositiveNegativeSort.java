//Sort array
import java.util.*;
class PosNeg
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
	 
  }
}
public class PositiveNegativeSort
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