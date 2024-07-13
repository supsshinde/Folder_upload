//question3
import java.util.*;
class ques3
{
	public static void main(String x[])
	{
		 int temp,size;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter size of array");
		 size=sc.nextInt();
		 int a[]=new int[size+1];
		 System.out.println("Enter elements");
		 for(int i=0;i<size;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 for(int i=0;i<size;i++)
		 {
			 for(int j=i+1;j<size;j++)
			 {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			 }				
		 }
		 System.out.println("After shifting all elements at the end");
		 for(int i=0;i<size;i++)
		 {
			 System.out.println(a[i]);
		 }	
	}		 
}