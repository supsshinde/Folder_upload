//Client Application
import java.util.*;
class Product
{
	private int id,price,quantity,total;
	private String name;
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setPrice(int pr)
	{
		price=pr;;
	}
	public int getPrice()
	{
		return price;
	}
	public void setQuantity(int q)
	{
		quantity=q;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setTotal(int t)
	{
	   total=t;
	}
	public int getTotal()
	{
		return total;
	}
}
class Customer
{
	private int cid;
	private String cname;
	private String contact;
	public void setCid(int id)
	{
		cid=id;
	}
	public int getCid()
	{
		return cid;
	}
	public void setCname(String n)
	{
		cname=n;
	}
	public String getCname()
	{
		return cname;
	}
	public void setContact(String cont)
	{
		contact=cont;
	}
	public String getContact()
	{
		return contact;
	}
}
class Bill
{
	Product prod[];
	Customer cus;
	void setOrder(Customer c, Product ...p)
	{
		prod=p;
		cus=c;
	}
	void generateInvoice()
	{
		System.out.println("Customer name %s\t" +cus.getCname()+ "ID " +cus.getCid()+ "Contact " +cus.getContact());
		System.out.println("****************************************************************");
		int GTotal=0;
		System.out.println("Product ID \t\t Product Name \t\t 	Quantity \t\t Price \t\t Total");
		for(int i=0;i<prod.length;i++)
		{
			prod[i].setTotal(prod[i].getPrice()*prod[i].getQuantity());
			System.out.printf(prod[i].getId()+ "\t\t" +prod[i].getName()+ "\t\t" +prod[i].getQuantity()+ "\t\t" +prod[i].getPrice()+ "\t\t" +prod[i].getTotal());
		    GTotal=GTotal+prod[i].getTotal();
		}
	 System.out.println("Grand Total is " +GTotal);	
	}
}
public class ClientApplication
{
	public static void main(String x[])
	{
		int TProduct;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total product");
		TProduct=sc.nextInt();
		
		int cid;
		String cname;
		String contact;
				
		System.out.println("Enter customer id");
		cid=sc.nextInt();
		System.out.println("Enter customer Name");
		sc.nextLine();
		cname=sc.nextLine();
		System.out.println("Enter customer contact");
		sc.nextLine();
		contact=sc.nextLine();
		
		Customer c=new Customer();
		c.setCid(cid);
		c.setCname(cname);
		c.setContact(contact);
		
		int pid,pprice,pquantity;
		String pname;
		
		Product P[]=new Product[TProduct];
		for(int i=0;i<TProduct;i++)
		{
			System.out.println("Enter product id");
			pid=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter product name");
			pname=sc.nextLine();
			sc.nextLine();
	
			System.out.println("Enter product Quantity");
			pquantity=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter product Price");
			pprice=sc.nextInt();
			
			P[i].setId(pid);
			P[i].setName(pname);
			P[i].setQuantity(pquantity);
			P[i].setPrice(pprice);

		}
	 Bill B=new Bill();
     B.setOrder(c,P);
     B.generateInvoice();	 
	}
}
