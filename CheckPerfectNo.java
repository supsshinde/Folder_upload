//Check number is perfect or not
import java.util.*;
class Perfect
{
	int no;
	void setNumber(int no)
	{
	  this.no=no;
	}
	boolean checkPerfect()
	{
		boolean b=true;
		int sum=1;
	  for(int i=2;i<no;i++)
	  {
        if(no%i==0)
		{
		  sum=sum+i;
		}			
	  }	
      if(sum==no)
	  {
		  b=true;
	  }		  
	  else
	  {
		 b=false; 
	  }
	  return b;
	}
}
public class CheckPerfectNo 
{
 public static void main(String x[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  n=sc.nextInt();
  Perfect P=new Perfect();
  P.setNumber(n);
  boolean b=P.checkPerfect();
  if(b==true)
  {
   System.out.println("Perfect");
  }
  else
  {
   System.out.println("Not Perfect");	  
  }
 }
}