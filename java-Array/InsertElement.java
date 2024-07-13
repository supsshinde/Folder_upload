//Insert element on specified element
import java.util.*;
class Display
{
 int m[],index,value,size;
 void AddElement(int m[],int index,int value,int size)
 {
	 this.m=m;
	 this.value=value;
	 this.index=index;
	 this.size=size;
 }
 void showElement()
 {
	 for(int i=size-1;i>=index;i--)
	 {
		m[i+1]=m[i];
        if(i==index)
		{
			m[i]=value;
		}
	 }
	 for(int i=0;i<m.length;i++)
	 {
		 System.out.println(m[i]);
	 }	 
 }
}
public class InsertElement
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int index,value,size;
  
  System.out.println("Enter index");
  index=sc.nextInt();
  
  System.out.println("Enter size");
  size=sc.nextInt();
  
  System.out.println("Enter value which u want to insert");
  value=sc.nextInt();
 
  int a[]=new int[size+1];
  System.out.println("Enter array elements");
  for(int i=0;i<size;i++)
  {
	  a[i]=sc.nextInt();
  }	  
  Display D=new Display();
  D.AddElement(a,index,value,size);
  D.showElement();
 }
}