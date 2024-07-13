//Display all prime numbers from 1 to 100\

import java.util.*;
class Prime
{
 int no;
 void setNumber(int n)
 {
	 no=n;
 }
 int getNumber()
 {
	 int flag=1;
	 for(int i=2;i<=no;i++)
	 {
		 flag=1;
		 for(int j=2;j<i;j++)
		 {
			if(i%j==0)
			{
				flag=0;
			}				
		 }
	  if(flag==1)
	  {
		  System.out.println(i);
	  }		  
	 }
	 return 0;
 }
}
public class DisplayPrime
{
 public static void main(String x[])
 {
  int no;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any number");
  no = sc.nextInt();
  Prime p=new Prime();
  p.setNumber(no);
  System.out.println("Prime numbers from 1 to " +no+ "are");
  p.getNumber();

 }
}