//Merge two array
import java.util.*;
class MergeTwoArray
{
 int a[],b[]; 
 MergeTwoArray(int a[], int b[])
 {
  this.a=a;
  this.b=b;
 }
 int[] getMergeArray()
 {
   int k=0;
   int s3=a.length+b.length;
   int c[]=new int[s3];
   for(int i=0;i<a.length;i++)
   {
	 c[k]=a[i];
     k++;	 
   }
   for(int i=0;i<b.length;i++)
   {
	 c[k]=b[i];
     k++;	 
   } 
   return c;  
 }
}
public class MergeArray
{
 public static void main(String x[])
 {
  int s1,s2;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of first array");
  s1=sc.nextInt();
  System.out.println("Enter size of second array");
  s2=sc.nextInt();
  int m[]=new int[s1];
  int n[]=new int[s2];
  System.out.println("Enter first array elements");
  for(int i=0;i<s1;i++)
  {
	m[i]=sc.nextInt();  
  }	  
  System.out.println("Enter second array elements");
  for(int i=0;i<s2;i++)
  {
	n[i]=sc.nextInt();  
  }	 
  MergeTwoArray M=new MergeTwoArray(m,n); 
  int s3=s1+s2;
  System.out.println("Merged array is ");
  int c[]=M.getMergeArray();
  for(int k=0;k<s3;k++)
  {
	System.out.println(c[k]);
  } 
 }
}