//calculate sum of array elements
import java.util.*;
class ArrSum 
{
  int arr[],size;
  void setValue(int size, int arr[])
  {
    this.arr=arr;
	this.size=size;
  }
  int getArrSum()
  {
    int sum=0;
	for(int i=0;i<size;i++)
	{
		sum=sum+arr[i];
	}
	return sum;
  }
}
public class calculateSum
{
 public static void main(String x[])
 {
   int size;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of array");
   size=sc.nextInt();
   int a[]=new int[size];
   ArrSum A=new ArrSum();
   A.setValue(size,a);
   System.out.println("Enter array elements");
   for(int i=0;i<size;i++)
   {
	   a[i]=sc.nextInt();
   }
  int sum=A.getArrSum();
  System.out.println("Sum of array element is " +sum);  
 }
}