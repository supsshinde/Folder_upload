//Find maximum value from array
import java.util.*;
class FindMax
{
  private int m[],size;
  void setArray(int size, int a[])
  {
		m=a;
        this.size=size;		
  }
  int getMax()
  {
	int max=m[0];
    for(int i=0;i<size;i++)
	{
	  if(m[i]>max)
	  {
		  max=m[i];
	  }		  
	}
    return max;	
  }
}
public class FindMaxValue
{
  public static void main(String x[])
  {
	  int size;
      Scanner sc=new Scanner(System.in);	 
      System.out.println("Enter size of array"); 
      size=sc.nextInt();	  
      int a[]=new int [size];
	  System.out.println("Enter array elements"); 
	  for(int i=0;i<size;i++)
	  {
		a[i]=sc.nextInt(); 
	  }
   FindMax F=new FindMax();
   F.setArray(size,a);
   int max=F.getMax();
   System.out.println("Maximum element from array is " +max);
  }
}