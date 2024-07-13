//Find floor and ceil
import java.util.*;
class Parent
{
int m[],size;
 void setValue(int m[],int size)
 {
  this.m=m;
  this.size=size;
 }
}
class FindFloorCeil extends Parent
{
	int f,c;	
 void find(int k)
 {
	 for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				if(m[i]>m[j])
				{
					int temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}
			}
		}
   for(int i=0;i<size;i++)
   {
	   if(k==m[i])
	   {
		  f=m[i];
          c=m[i];
          break;		  
	   }
	    if(k<m[0])
	   {
		  f=-1;
          c=m[i];
          break;		  
	   }
	    if(k>m[size-1])
	   {
		   f=m[size-1];
		   c=-1;
		   break;
	   }
		  if(k>m[i] && k<m[i+1])
		  {
			  f=m[i];
			  c=m[i+1];
		  }
    }
System.out.println("Floor is " +f);	
System.out.println("Ceil is " +c);	
   }
 }
public class FindFloorAndCeil
{
 public static void main(String x[])
 {
	 int size;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter size of array");
	 size=sc.nextInt();
	 
	 System.out.println("Enter value to find floor and ceil");
	 int k=sc.nextInt();
	 
	 int a[]=new int[size];
	 System.out.println("Enter elements in array");
	 for(int i=0;i<size;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 FindFloorCeil F=new FindFloorCeil();
	 F.setValue(a,size);
	 F.find(k);
 }
}
