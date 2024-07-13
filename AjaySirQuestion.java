import java.util.*;
class ABC
{
 int m[],size;
 void setValue(int m[],int size)
 {
  this.m=m;
  this.size=size;
 }
 void getValue()
 {
	   int temp;

  for(int i=0;i<size;i++)
  {
	  for(int j=0;j<size;j++)
	  {
		  if(m[i]>m[j])
		  {
			  temp=m[i];
			  m[i]=m[j];
			  m[j]=temp;       //3 6 8 9 15
		  }
	  }
  }
   for(int i=0;i<size;i++)
   {
       i=0;
	   temp=m[i];
	   size--;
	   for(int k=i;k<size-1;k++)
	   {
		   m[k]=m[k+1];
	   }
	   m[size-1]=temp;
	   if(i>size)
	   {
		   System.out.println(m[i]);
	   }
   }	   
  
 }
}
public class AjaySirQuestion
{
 public static void main(String x[])
 {
	 int size;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter size of array");
	 size=sc.nextInt();
	 
	 int a[]=new int[size];
	 System.out.println("Enter elements in array");
	 for(int i=0;i<size;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 ABC A=new ABC();
	 A.setValue(a,size);
	 A.getValue();
 }
}
