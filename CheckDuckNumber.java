//Check number is Duck number or not
import java.util.*;
class CheckDuck
{
	private int no;
	CheckDuck(int no)
	{
		this.no=no;
	}
	Boolean isDuckNumber()
	{
		Boolean b=false;
		while(no!=0)     //1033
		{
			int rem=no%10;
			if(rem==0)
			{
				b=true;
				break;
			}
		 no=no/10;	  
		}
		return b;
	}
}
public class CheckDuckNumber
{
	public static void main(String x[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		CheckDuck C=new CheckDuck(n);
		Boolean b=C.isDuckNumber();
		if(b==true)
		{
			System.out.println("Number is Duck");
		}	
		else
		{
			System.out.println("Number is not Duck");
		}
	}	
}
