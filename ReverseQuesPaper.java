import java.util.*;
class Reverse
{
	int n;
  void setValue(int n)
  {
	 this.n=n; 
  }
  void checkPerfect()
  {
	  int sum=0;
	  for(int i=1;i<n;i++)
	  {
		  if(n%i==0)
		  {
			  sum=sum+i;
		  }
	  }
	  if(n==sum)
	  {
		  System.out.println("Perfect Number");
	  }
	  else
	  {
		  System.out.println("Not Perfect Number");
	  }
  }
}
public class ReverseQuesPaper
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		Reverse R=new Reverse();
		R.setValue(no);
		R.checkPerfect();
	}
}