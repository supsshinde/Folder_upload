import java.util.*;
class FloorAndCeil
{
	int m[],size;
	void SetValue(int m[],int size)
	{
		this.m=m;
		this.size=size;
	}
	void GetValue()
	{
		int f=0,c=0;
		 for(int i=0;i<size;i++)
		    {
			     for(int j=0;j<size;j++)
				  {
				     if(i==j)
                       {
                         f=m[i];
                         c=m[j];
                       }
				  }
              System.out.printf("%d :- ceiling ---> %d floor --->%d\n",m[i],c,f);
            }
	}
}
public class EachElementfloorCeil
{
   public static void main(String x[])
     {
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int c=0,f=0;
		System.out.println("Enter the array values");
		for(int i=0;i<size;i++)
		{
		   a[i]=sc.nextInt();
		}
       FloorAndCeil F=new FloorAndCeil();	
       F.SetValue(a,size);	
       F.GetValue();	   
	 }
}	   