//second smallest number
import java.util.*;
class ArrOp
{
	int m[],size;
	ArrOp(int m[],int size)
	{
		this.m=m;
		this.size=size;
	}
	void FindSecSmall(int k)
	{
		int temp,count=1;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				if(m[i]>m[j])
				{
					temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			if(m[i]!=m[i+1])
			{
				count++;
				if(count==k)
				{
					System.out.printf("Kth smallest element is %d",m[i+1]);
					break;
				}
			}
		}
	}
}
public class ArrOpQues1
{
 public static void main(String x[])
 {
	 int size;
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of array");
	 size=sc.nextInt();
	 System.out.println("Enter value");
	 int  k=sc.nextInt();
	 
	 int a[]=new int[size];
	 
	 System.out.println("Enter array elements");
	 for(int i=0;i<size;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	ArrOp A=new ArrOp(a,size);
	//A.ArrOp(a,size);
    A.FindSecSmall(k);	
 }
}