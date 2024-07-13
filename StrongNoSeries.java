//Display all prime no from 1 to N
//Armstrong no series
import java.util.*;
import java.math.*;
class Strong
{
	int n;
	void setValue(int n)
	{
		this.n=n;
	}
	void getValue()
	{
		int rem,temp,sum=0;
		for(int i=1;i<=n;i++)
		{
			temp=i;
			rem=temp%10;
			temp=temp/10;

			int j=1;
			int fact=1;
			while(j<=rem)
			{
				fact=fact*j;
				j++;
			}
		 sum=sum+fact;
		 if(sum==i)	
		 {
			 System.out.println(i);
		 }
		}			
	}
}
public class StrongNoSeries
{
 public static void main(String x[])
 {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int no=sc.nextInt();
	Strong A=new Strong();
	A.setValue(no);
	System.out.println("Strong no series is ");
	A.getValue();
 }
}