//find max and min element from array
import java.util.*;
class Display
{
 int m[];
 void AddElement(int m[])
 {
	 this.m=m;
 }
 void showElement()
 {
	 int max=m[0];
	 for(int i=0;i<5;i++)
	 {
		if(max<m[i])
		{
			max=m[i];
		}			
	 }
	 System.out.println("Maximum element is " +max);
	 int min=m[0];
	 for(int i=0;i<5;i++)
	 {
		if(min>m[i])
		{
			min=m[i];
		}			
	 }
	 	 System.out.println("Maximum element is " +min);
 }
}
public class DisplayMinMaxArray
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
  Display D=new Display();
  D.AddElement(a);
  D.showElement();
 }
}