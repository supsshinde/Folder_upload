//Check number is prime or not
import java.util.*;
class Prime
{
	int no;
	
	void setNumber(int no)
	{
	  this.no=no;
	}
	boolean checkPrime()
	{
		boolean b=true;
	  for(int i=2;i<no;i++)
	  {
        if(no%i==0)
		{
		  b=false;
		  break;
		}			
	  }		  
	  return b;
	}
}
public class CheckPrime 
{
 public static void main(String x[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  n=sc.nextInt();
  Prime P=new Prime();
  P.setNumber(n);
  boolean b=P.checkPrime();
  if(b==true && n!=1)
  {
   System.out.println("Prime");
  }
  else
  {
   System.out.println("Not prime");	  
  }
 }
}