//Calculate Factorial of number
import java.util.*;
class Factorial
{
 int x;	
 void setValue(int x)
 {
	this.x=x; 
 }
 int getFactorial()
 {
	int Fact=1; 
	for(int i=1;i<=x;i++)
	{
		Fact=Fact*i;
	}	
  return Fact;	
 }
}
public class CalculateFactorial
{
 public static void main(String x[])
 {
  int no;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  no=sc.nextInt();
  Factorial F=new Factorial();
  F.setValue(no);
  int result=F.getFactorial();
  System.out.println("Factorial is " +result);
 }
}