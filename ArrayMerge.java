//Merge Two Array
import java.util.*;
class MergeTwoArray 
{
   private int p[],q[],k=0,s1,s2;
  void MergeTwoArray(int s1, int s2, int p[],int q[])
  {
    this.p=p;
	this.q=q;
	this.s1=s1;
	this.s2=s2;
  }
  int[] getMergeArray()
  {
	int s3=s1+s2;
	int c[]=new int[s3];
	for(int i=0;i<s1;i++)
    {
	  c[k]=p[i];
      k++;	  
    }
    for(int i=0;i<s2;i++)
    {
	  c[k]=q[i];
      k++;	
    }
   return c;
  }
}
public class ArrayMerge
{
  public static void main(String x[])
  {
	int s1,s2;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of first array");
	s1=sc.nextInt();
	int a[]=new int[s1];  
	System.out.println("Enter first array value");
	for(int i=0;i<s1;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter size of second array");
	s2=sc.nextInt();
	int b[]=new int[s2];  
	System.out.println("Enter second array value");
	for(int i=0;i<s2;i++)
	{
		b[i]=sc.nextInt();
	}
   MergeTwoArray M=new MergeTwoArray();
   M.MergeTwoArray(s1,s2,a,b);
   int c[]=M.getMergeArray();
   System.out.println("After merging two array");
   for(int k=0;k<c.length;k++)
   {
	  System.out.println(c[k]); 
   }
  }
}