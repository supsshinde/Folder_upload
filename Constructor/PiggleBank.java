import java.util.*;
class AddAmount
{
 int amount,add;
 AddAmount()
 {
	 //System.out.println(amount);
 }
 AddAmount(int amount,int add)
 {
   this.amount=amount;
   this.add=add;
   System.out.println("Final amount is "+(amount+add));
 }
}
public class PiggleBank
{
 public static void main(String x[])
 {
	 int a=50;
	 int b;
	 Scanner sc=new Scanner(System.in);
   System.out.println("Enter amount which you want to add in piggle bank");
   b=sc.nextInt();
	 AddAmount A=new AddAmount();
	 AddAmount A1=new AddAmount(a,b);
 }
}