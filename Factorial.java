//Calculate factorial using function
import java.util.*;
class CalculateFact
{
 private int no,fact=1;	
 void setNumber(int no)
 {
	this.no=no;
 }
 int getFactorial()
 {
	 for(int i=1;i<=no;i++)
	 {
		fact=fact*i; 
	 }
	 return fact;
 }
}
public class Factorial 
{
 public static void main(String x[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  n=sc.nextInt();
  CalculateFact c=new CalculateFact();
  c.setNumber(n);
  int fact=c.getFactorial();
  System.out.println("Factorial is " +fact);
 }
}