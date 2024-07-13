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
	// int max=m[size-1],min=m[size-1];
  for(int i=size-1;i>=0;i--)
  {
		for(int j=i-1;j>=0;j--)
	    {
		   if(m[i]<m[j])
		   {
			  int max=m[j];
			  int min=m[j];
              for(int k=j;k>=0;k--)
			  {
				  if(max<m[k])
				  {
					  m[k]=m[i];
				  }
				  else
				  {
					  if(min>m[k])
					  {
						  m[k]=m[i];
					  }
				  }
			  }				  
	       }
		}
	System.out.println("Remaining element is " +m[i]);
	break;
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
