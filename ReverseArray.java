//Reverse array
import java.util.*;
class Reverse 
{
  int m[],size;	
  void setArray(int size, int a[])
  {
    m=a;
	this.size=size;
  }
   int [] getSortArray()
   {
	 int end=size-1,temp;
     for(int i=0;i<size/2;i++)
	 {
		temp=m[i];
        m[i]=m[end];
        m[end]=temp;
        end--;		
	 }
	 return m;
   }
}
public class ReverseArray
{
 public static void main(String x[])
 {
  int size;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter size of array");
  size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter array elements");
  for(int i=0;i<size;i++)
  {
	a[i]=sc.nextInt();  
  }
  Reverse R=new Reverse();
  R.setArray(size,a);
  int m[]=R.getSortArray();
  System.out.println("Reverse array is");
  for(int i=0;i<size;i++)
  {
	  System.out.println(m[i]);
  }
 }
}