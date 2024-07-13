//Armstrong no series
import java.util.*;
import java.math.*;
class Armstrong
{
	int n;
	void setValue(int n)
	{
		this.n=n;
	}
	void getValue()
	{
		int temp,rem,count;
		for(int i=1;i<=n;i++)
		{
				temp=i;
				count=0;
				while(temp!=0)
				{
					temp=temp/10;
					count++;
				}
					  temp=i;
					  double sum=0;
					 
						 while(temp!=0)
						 {
							 rem=temp%10;
							 sum=sum+Math.pow(rem,count); 
							 temp=temp/10;
						 }
				
				  if(sum==i)
				  {
					 System.out.println(i);
				  }	
		}				  
	}
}
public class ArmstrongNoSeries
{
 public static void main(String x[])
 {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int no=sc.nextInt();
	Armstrong A=new Armstrong();
	A.setValue(no);
	System.out.println("Armstrong no series is ");
	A.getValue();
 }
}