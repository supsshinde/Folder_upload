//Sort array in Ascending order
import java.util.*;
class SortArr 
{
	int m[],temp;
  void setArray(int a[])
  {
    m=a;
  }
   int [] getSortArray()
   {
	   for(int i=0;i<10;i++)
	   {
		   for(int j=i+1;j<10;j++)
		   {
			   if(m[i]<m[j])
			   {
				temp=m[i];
                m[i]=m[j];
                m[j]=temp;				
			   }
		   }
	   }
	   return m;   
   }
}
public class SortArray
{
  public static void main(String x[])
  {
     int a[]=new int[10];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter array elements");
     for(int i=0;i<10;i++)
     {
	   a[i]=sc.nextInt();
     }
     SortArr S=new SortArr();
     S.setArray(a);
     int m[]=S.getSortArray();
     System.out.println("Ascending Sorted array is");
     for(int i=0;i<10;i++)
     {
	   System.out.println(m[i]);   
     }
  }
}