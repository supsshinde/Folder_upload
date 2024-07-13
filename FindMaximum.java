//Find maximum value from Array
import java.util.*;
class FindMax
{
  int b[],size;
  void setArray(int b[], int size)
  {
	this.size=size;
    this.b=b;	
  }
  int getMax()
  {
	int max=b[0];
    for(int i=0;i<size;i++)
	{
	  if(max<b[i])
      {
		  max=b[i];
	  }		  
	}		
	return max;
  }
}
public class FindMaximum
{
 public static void main(String x[])
 {
  int size;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array");
  size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter array elements");
  for(int i=0;i<size;i++)
  {
	  a[i]=sc.nextInt();
  }
  FindMax F=new FindMax();
  F.setArray(a,size);
  int max=F.getMax();
  System.out.println("Maximum value form array is " +max);
 }
}