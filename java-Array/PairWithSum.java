//Find pair with given sum in array
import java.util.*;
class Sum
{
  int size,m[],sum;	
  void setValue(int size,int m[],int sum)
  {
	this.m=m;
    this.size=size;
    this.sum=sum;	
  }
  void getValue()
  { 
  int flag=0;
  	System.out.println("index of Pair of sum is ");
	for(int i=0;i<size;i++)     //6 8 4 -5 7 9
	{
	  for(int j=i+1;j<size;j++)
	  {		  		
	    if(sum==m[i]+m[j])
	    {
		  System.out.printf("%d\t%d\n",i,j); 
          flag=1;		  
	    }
	  }
	}
	if(flag==0)
	{
		System.out.println("You entered wrong value");
	}
  }
}
public class PairWithSum
{
 public static void main(String x[])
 {
   int size,sum;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of array");
   size=sc.nextInt();
   System.out.println("Enter the sum");
   sum=sc.nextInt();
   int a[]=new int[size];
   System.out.println("Element in array");
   for(int i=0;i<size;i++)
   {
	   a[i]=sc.nextInt();
   }	 
 Sum s=new Sum();
 s.setValue(size,a,sum); 
 s.getValue();
 }
}