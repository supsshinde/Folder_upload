//Check number is Armstrong or not
import java.util.*;
class Armstrong
{
	int no;
	void setNumber(int no)
	{
	  this.no=no;
	}
	void checkArmstrong()
	{
	  int rem,count=0,temp;
	  temp=no;
	  while(no!=0)
	  {
       	rem=no%10;
		count++;
		no=no/10;
	  }		
       no=temp;	
       int p=1,sum=0;	   
	   while(no!=0)
	   {
		 rem=no%10;
		 p=1;
		  for(int i=0;i<count;i++)
		  {
			 p=p*rem;
		  }
		 sum=sum+p; 
		 no=no/10;		 
	   }
	  if(sum==temp)
	  {
	   System.out.println("Armstrong");
	  }
	  else
	  {
	   System.out.println("Not Armstrong");	  
	  }
	}
}
public class CheckArmstrongNo
{
 public static void main(String x[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  n=sc.nextInt();
  Armstrong P=new Armstrong();
  P.setNumber(n);
  P.checkArmstrong();
 }
}