//Find minimum and maximum element from array
import java.util.*;
class FindMinMaxValue
{
  int m[],size,max,min;	
  void setArray(int size, int a[])
  {
     this.size=size;
	 m=a;
  }
  int  minArray()
  {
    min=m[0];
	for(int i=0;i<size;i++)
	{
		if(m[i]<min)
		{
		  min=m[i];	
		}	
	}
	return min;
  }
  int  maxArray()
  {
    max=m[0];
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
public class FindMinMax
{
  public static void main(String x[])
  {
	 int size;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size");
     size=sc.nextInt();
     int a[]=new int[size];
     System.out.println("Enter array elements");
     for(int i=0;i<size;i++)
     {
		a[i]=sc.nextInt(); 
	 }
  FindMinMaxValue F=new FindMinMaxValue();
  F.setArray(size,a);
  int max=F.maxArray();
  System.out.println("Maximum value is " +max);  
  int min=F.minArray();
  System.out.println("Minimum value is " +min);  
  }  
}