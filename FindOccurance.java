import java.util.*;

class Occurance
 {
	int m[],size;
	void setArray(int size, int a[])
	{
		m=a;
		this.size=size;
	}
	
	void getoccurrence()
	{
		int count=1;
		for(int i=0;i<size;i++)
		{
			count=1;
			for(int j=i+1;j<size;j++)
			{
				if(m[i]==m[j])
				{
					count++;
					m[j]=-1;
				}
			}
			if(m[i]!=-1)
			{
				System.out.println(m[i]+ " -----> "+count);
			}
		}	
	}
	 
 }
 public class FindOccurance
 {
	public static void main(String x[])
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		Occurance O =new Occurance();
		O.setArray(size,a);
		O.getoccurrence();
	}	
 }
