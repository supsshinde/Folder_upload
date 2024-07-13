//print 1 to N prime numbers
import java.util.*;
class Prime
{
	int n;
	void setValue(int n)
	{
		this.n=n;
	}
	void getValue()
	{
		int flag=1;
		for(int i=2;i<=n;i++)
		{
			flag=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
		  if(flag==1)
		  {
			System.out.println(i);
		  }			
		}	
	}
}
public class DisplayPrimeNo
{
 public static void main(String x[])
 {
  int no;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  no=sc.nextInt();
  Prime P=new Prime();
  P.setValue(no);
  System.out.println("Prime no series is");
  P.getValue();
 }
}