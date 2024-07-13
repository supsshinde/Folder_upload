//Calculate sum of array elements
//Display array
import java.util.*;
class Sum
{
 int m[],sum=0;
 void AddElement(int m[])
 {
	 this.m=m;
 }
 void showElement()
 {
	 for(int i=0;i<5;i++)
	 {
		sum=sum+m[i];		
	 }
	System.out.println("sum of array elements are " +sum); 
 }
}
public class CalculateSum
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int a[]=new int[5];
  System.out.println("Enter array elements");
  for(int i=0;i<5;i++)
  {
	  a[i]=sc.nextInt();
  }	  
  Sum D=new Sum();
  D.AddElement(a);
  D.showElement();
 }
}