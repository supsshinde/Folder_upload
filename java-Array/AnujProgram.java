//Sort array
import java.util.*;
class Anuj
{
  int m[];
  int size;
  void setArray(int m[], int size)
  {
	 this.size=size;
     this.m=m;	 
  }
  void getArray()
  {
	  int i,j;
	  System.out.println("Leaders are "); 
       for(i=0;i<size-1;i++)	  //3 4 2 7 11 6
	   {
		   for(j=i+1;j<size;j++)
		   {
		     if(m[i]<=m[j])
		     {
			   break;
		     }
		   }
		   if(j==size)
		   {
			   System.out.println(m[i]);
		   }
	   }
	   System.out.println(m[size-1]);
  }
}
public class AnujProgram
{
	public static void main(String x[])
	{
	  int size;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter size of array");
      size=sc.nextInt();
	  System.out.println("Enter array elements");
	  int a[]=new int[size];
	  for(int i=0;i<size;i++)
	  {
		a[i]=sc.nextInt();  
	  }	  
      Anuj S=new Anuj();
	  S.setArray(a,size);
	  S.getArray();
	}
}