//Calculate interest
import java.util.*;
class Interest
{
	public int P,R,T;
	void SetPRD(int P,int R,int T)
	{
		this.P=P;
		this.R=R;
		this.T=T;
	}
}
class CalculateInterest extends Interest
{
	int SI;
	void CallInterest()
	{
		SI=(P*R*T)/100;
		System.out.println("Simple interest is " +SI);
	}
}
public class InterestApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);	 
  int P,R,T;
  System.out.println("Enter Priciple amount");
  P=sc.nextInt();
  System.out.println("Enter Rate");
  R=sc.nextInt();
  System.out.println("Enter required time");
  T=sc.nextInt();
  CalculateInterest C=new CalculateInterest();
  C.SetPRD(P,R,T);
  C.CallInterest();
 }
}