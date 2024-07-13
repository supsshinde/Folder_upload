//Check perfect
import java.util.*;
class Reverse
{
int n;
 void setValue(int n)
 {
   this.n=n;
 }
 boolean checkPerfectNumber()
 {
   int sum=0;
   boolean b=true;
   for(i=1;i<n;i++)
   {
	   if(n%i==0)
	   {
		   sum=sum+i;
	   }
   }
   if(sum==n)
   {
	   b true;
   }
   else
   {
	   b=false;
   }
 }
}
public class perfect
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nectInt();
		Reverse R=new Reverse();
		R.setValue(n);
		boolean b=R.checkPerfectNumber();
		if(b==true)
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
	}
}