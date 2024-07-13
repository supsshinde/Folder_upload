//Array of object program 2
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
public class ArrayOfObj2
{
	public static void main(String x[])
	{
		int Did;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total products");
		int size=sc.nextInt();
		Product p[]=new Product[size];
		System.out.println("Enter id to delete specific record");
		Did=sc.nextInt();
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
		System.out.println("************************************************** ");
		for(int i=0;i<size;i++)
		{
			System.out.println(p[i].getId()+ " " +p[i].getName()+ " " +p[i].getPrice());
		}
		for(int i=0;i<size;i++)
		{
			if(Did==p[i].getId())
			{
				for(int j=i+1;j<size;j++)
				{
				 p[i]=p[j]; 
				}
			 size--;		
			}
		}
		System.out.println("************************************************** ");
		System.out.println("Records after delete specific id ");
		for(int i=0;i<size;i++)
		{
			System.out.println(p[i].getId()+ " " +p[i].getName()+ " " +p[i].getPrice());
		}
	}
}