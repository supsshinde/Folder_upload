//Check number is perfect or not
import java.util.*;
class Perfect
{
	int no;
	void setValue(int no)
	{
	  this.no=no;
	}
	int checkPerfect()
	{
	  int sum=0;
	  for(int i=1;i<no;i++)
	  {
        if(no%i==0)
		{
		  sum=sum+i;
		}			
	  }		  
	  return sum;
	}
}
public class CheckPerfect 
{
 public static void main(String x[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  n=sc.nextInt();
  Perfect P=new Perfect();
  P.setValue(n);
  int sum=P.checkPerfect();
  if(sum==n)
  {
   System.out.println("Perfect");
  }
  else
  {
   System.out.println("Not Perfect");	  
  }
 }
}