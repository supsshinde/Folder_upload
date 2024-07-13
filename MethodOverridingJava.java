//method overriding in java
import java.util.*;
class ArrParent 
{
  int size, m[];	
  void setValue(int size, int arr[])
  {
    this.size=size;
	m=arr;
  }
  void arrangeSeq()
  {
	System.out.println("Original array is");  
	{
		for(int i=0;i<size;i++)
		{
			System.ou.println(m[i]);
		}	
	}
    for(int i=0;i<size;i++)
	{
		System.out.println(m[i]);
	}
  }
}
class ArrangeAscendingOrder : extends ArrParent
{
  void setValue(int size, int arr[])
  {
     
  }
  void arrangeSeq()
  {
    for(int i=0;i<size;i++)
	{
	  for(int j=i+1;j<size;j++)
      {
		 if(m[i]>m[j]) 
		 {
			 temp=m[i];
			 m[i]=m[j];
			 m[j]=temp;
		 }
	  }		  
	}
	System.out.println("Ascending order array is ");
	for(int i=0;i<size;i++)
	{
		System.out.println(m[i]);
	}
  }
}
class ReverseArray : extends ArrParent
{
  void arrangeSeq()
  {
	int temp,end=size-1;
    for(int i=0;i<size/2;i++)
	{
	  temp=m[i];
      m[i]=m[end];
      m[end]=temp;
     end--;	  
	}
	System.out.println("Reverse array is");
	for(int i=0;i<size;i++)
	{
	  System.out.println(m[i]);	
	}
  }
}
public class MethodOverridingJava
{
 public static void main(String x[])
 {
  int size;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size");
  size=sc.nextInt();
  int a[]=new int(size);
  for(int i=0;i<size;i++)
  {
	a[i]=sc.nextInt();  
  }
  ArrangeAscendingOrder A= new ArrangeAscendingOrder();
  A.setValue(size,a);
  A.arrangeSeq();
  ReverseArray R= new ReverseArray();
  R.arrangeSeq();
 }
}