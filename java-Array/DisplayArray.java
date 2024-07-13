//Display array
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
	 System.out.println("Array elements are ");
	 for(int i=0;i<5;i++)
	 {
		System.out.println(m[i]);		
	 }
 }
}
public class DisplayArray
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