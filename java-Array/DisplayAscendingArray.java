//Display in ascending order
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
	 int temp;
	 System.out.println("Array in descending order ");
	 for(int i=0;i<5;i++)
	 {
		for(int j=i+1;j<5;j++)
        {
			if(m[i]<m[j])
			{
				temp=m[i];
				m[i]=m[j];
				m[j]=temp;
			}	
		}			
	 }	 
	 for(int i=0;i<5;i++)
	 {
		System.out.println(m[i]);		
	 }
 }
}
public class DisplayAscendingArray
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