import java.util.*;

public class RemoveMinMax
 {
    public static void main(String x[]) 
	{
        int a[]=new int[7];
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size");
        int size=sc.nextInt();
		
		System.out.println("Enter elements");

        for (int i=0;i<size;i++)
		{
            a[i]=sc.nextInt();
        }
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<5;i++)
		{
			while(size>1)
			{
	
			   if(a[i]>max)
				max=a[i];
			
			   if(a[i]<min)
				min=a[i];

			}
			System
		}
   }
}