//Array of object program 1
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
public class ArrayOfObj1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Product p[]=new Product[3];
		for(int i=0;i<p.length;i++)
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
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getId()+ " " +p[i].getName()+ " " +p[i].getPrice());
		}
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].getPrice()<p[j].getPrice())
				{
					Product temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		System.out.println("************************************************** ");
		System.out.println("price wise Product in descending order ");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getId()+ " " +p[i].getName()+ " " +p[i].getPrice());
		}
	}
}