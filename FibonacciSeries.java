//Fibonacci number series
import java.util.*;
class Fibonacci
{
	int f1,f2,fib,n;
	void setValue(int f1, int f2, int n)
	{
		this.f1=f1;
		this.f2=f2;
		this.n=n;
	}
	void getValue()
	{
	 for(int i=0;i<=n;i++)	
	 {
		System.out.println(f1);
		fib=f1+f2;	
		f1=f2;
		f2=fib;
	 }
	}
}
public class FibonacciSeries
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int no=sc.nextInt();
  Fibonacci F=new Fibonacci();
  F.setValue(0,1,no);
  System.out.println("Fibonacci no series is ");
  F.getValue();
 }
}