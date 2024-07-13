import java.util.*;
public class ShiftZeroTolast
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter size of array ");
		int size=sc.nextInt();
		int a[]=new int[size+1];

		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int temp=0;
		for(int i=0; i<size; i++)
		{
			if(a[i]==0)
			{
				temp=a[i];
				for(int j=i;j<size;j++)
				{
					a[j]=a[j+1];
				}
			}
		 a[size-1]=temp;
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+"\t");
		}
		
	}
}