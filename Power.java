//Find power of number using function
import java.util.*;
class CalculatePower
{
	private int B,I;
	private int power=1;
	void setValue(int base,int index)
	{
		B=base;
		I=index;
	}
	int getPower()
	{
	  for(int i=1;i<=I;i++)
	  {
		power=power*B;  
	  }	
      return power;	  
	}
}
public class Power
{
 public static void main(String x[])
 {
   int b,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Base");
   b=sc.nextInt();
   System.out.println("Enter Index");
   i=sc.nextInt();
   CalculatePower c=new CalculatePower();
   c.setValue(b,i);
   int power=c.getPower();
   System.out.println("Power is" +power);
 }
}