//Check number is Armstrong or not
import java.util.*;
class Armstrong
{
	int no;
	double p,temp,rem,count=0,sum=0;
	void setValue(int no)
	{
	  this.no=no;
	}
	boolean checkArmstrong()
	{ 
	  temp=no;
	  while(temp!=0)
	  {
		temp=temp/10;  
		count++;
	  }
	  temp=no;
	  boolean b=false;
	  for(int i=0;i<=temp;i++)
	  {
		rem=temp%10;
        temp=temp/10;
        while(temp!=0)
		{
		  p=Math.pow(rem,count);
          sum=sum+p;		  
		}			
	  }
		if(sum==no)
		{
			b=true;
		}
   }
}
public class CheckArmstrong 
{
 public static void main(String x[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  n=sc.nextInt();
  Armstrong A=new Armstrong();
  A.setValue(n);
  boolean b = A.checkArmstrong();
  if(b==true)
  {
   System.out.println("Armstrong");
  }
  else
  {
   System.out.println("Not Armstrong");	  
  }
 }
}