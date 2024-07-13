//Array of object program 4
import java.util.*;
class Product
{
	private int id,price;
	private String name;
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setPrice(int p)
	{
		price=p;
	}
	public int getPrice()
	{
		return price;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
}
public class ArrayOfObj4
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total products");
		int size=sc.nextInt();
		Product p[]=new Product[size];
		for(int i=0;i<size;i++)
		{
			p[i]=new Product();
			System.out.println("Enter id name and price");
			int Id=sc.nextInt();
			sc.nextLine(); 			   //shift cursor on new line before string input
			String Name=sc.nextLine();
			int Price=sc.nextInt();
			p[i].setId(Id);
			p[i].setName(Name);
			p[i].setPrice(Price);
		}
		System.out.println("************************************************ ");
		for(int i=0;i<size;i++)
		{
			System.out.println(p[i].getId()+ " " +p[i].getName()+ " " +p[i].getPrice());
		}
		System.out.println("Records of same price are ");
		for(int i=0;i<size;i++)
		{
		  for(int j=i+1;j<size;j++)
		  {
			 if(p[i].getPrice()==p[j].getPrice())
			 {
				 System.out.println(p[i].getId());
				 System.out.println(p[i].getName());
				 System.out.println(p[i].getPrice());
			 }
		  }			 
		}
	}
}