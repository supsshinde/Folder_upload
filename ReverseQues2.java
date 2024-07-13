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
   for(int i=1;i<n;i++)
   {
	   if(n%i==0)
	   {
		   sum=sum+i;
	   }
   }
   if(sum==n)
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
public class ReverseQues2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		Reverse R=new Reverse();
		R.setValue(no);
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