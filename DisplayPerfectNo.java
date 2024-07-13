//print 1 to N perfect numbers
import java.util.*;
class Perfect
{
	int n;
	void setValue(int n)
	{
		this.n=n;
	}
	void getValue()
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
		  if(sum==i)
		  {
			System.out.println(i);
		  }			
		}	
	}
}
public class DisplayPerfectNo
{
 public static void main(String x[])
 {
  int no;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  no=sc.nextInt();
  Perfect P=new Perfect();
  P.setValue(no);
  System.out.println("Perfect no series is");
  P.getValue();
 }
}