//Reverse the each element in array
import java.util.*;
class ArrOp1
{
	int m[],size;
	ArrOp1(int m[],int size)
	{
		this.m=m;
		this.size=size;
	}
	void FindRev()
	{
		int rem,rev=0,temp,j=0;
		for(int i=0;i<size;i++)   //243 78 19 372 89
		{
			temp=m[i];
			rev=0;
			while(temp>0)
			{
			rem=temp%10;
			temp=temp/10;
			rev=(rev*10)+rem;
			}
		System.out.printf("%d\t",rev);
		}
	}
}
public class ArrOpQues4
{
 public static void main(String x[])
 {
	 int size;
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
	 size=sc.nextInt();
	 
	 int a[]=new int[size];
	 
	 System.out.println("Enter array elements");
	 for(int i=0;i<size;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	ArrOp1 A=new ArrOp1(a,size);
	//A.ArrOp(a,size);
    A.FindRev();	
 }
}