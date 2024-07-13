//Delete element of specified element
import java.util.*;
class Display
{
 int m[],index,size;
 void AddElement(int m[],int index,int size)
 {
	 this.m=m;
	 this.index=index;
	 this.size=size;
 }
 void showElement()
 {
	 for(int i=index;i<size;i++)
	 {
		m[i]=m[i+1];
	 }
	 System.out.println("After delete specific index");
	 for(int i=0;i<size-1;i++)
	 {
		 System.out.println(m[i]);
	 }	 
 }
}
public class DeleteElement
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int index,value,size;
  
  System.out.println("Enter index");
  index=sc.nextInt();
  
  System.out.println("Enter size");
  size=sc.nextInt();
 
  int a[]=new int[size+1];  //we need to set 1 block empty
  System.out.println("Enter array elements");
  for(int i=0;i<size;i++)
  {
	  a[i]=sc.nextInt();
  }	  
  Display D=new Display();
  D.AddElement(a,index,size);
  D.showElement();
 }
}