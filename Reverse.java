//Reverse the number
import java.util.*;
class ReverseNo
{
  private int rev=0,no,rem;
  void setNum(int no)
  {
	this.no=no; 
  }
  int getReverse()
  {
	while(no!=0)
	{
		rem=no%10;
		no=no/10;
		rev=(rev*10)+rem;
	}
    return rev;	
  }
}
public class Reverse
{
 public static void main(String x[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  n=sc.nextInt();
  ReverseNo R=new ReverseNo();
  R.setNum(n);
  int rev=R.getReverse();
  System.out.println("Reverse number is " +rev);
 }
}