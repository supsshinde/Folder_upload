//Second largest element from array
import java.util.*;
class SecondLargestElement
{
	int m[];
	int size;
 void setValue(int size,int m[])
 {
    this.size=size;
	this.m=m;
 }
 void getValue()
 {
   int temp,count=1;
   for(int i=0;i<size;i++)
   {
	   for(int j=i+1;j<size;j++)
	   {
		   if(m[i]<m[j])
		   {
			   temp=m[i];
			   m[i]=m[j];
			   m[j]=temp;
		   }
	   }
   }
   for(int i=0;i<size;i++)  
   {
     if(m[i]!=m[i+1])
	 {
		count++;
        if(count==2)
        {
		  System.out.println(m[i+1]);
		  break;
		}			
	 }
   }	   
 }
}
public class SecondLargest
{
 public static void main(String x[])	
 {
	 int size;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter size of array");
	 size=sc.nextInt();
	 int a[]=new int[size+1];
	 System.out.println("Enter element in array");
	 for(int i=0;i<size;i++)
	 {
		a[i]=sc.nextInt(); 
	 }
	SecondLargestElement S=new SecondLargestElement();
	S.setValue(size,a);
	S.getValue(); 
 }
}