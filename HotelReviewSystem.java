//Hotel Review System
import java.util.*;
class Hotel
{
 private int id;
 private String name;
 private String type;
 private Customer customer[];
 public void setid(int id)
 {
	 this.id=id;
 }
 public int getid()
 {
	 return id;
 }
 public void setname(String name)
 {
	 this.name=name;
 }
 public String getname()
 {
	 return name;
 }
 public void settype(String type)
 {
	 this.type=type;
 }
 public String gettype()
 {
	 return type;
 }
 public void setCustomer(Customer customer[])
 {
	 this.customer=customer;
 }
 public Customer[] getCustomer()
 {
	return customer; 
 }
}
class Customer
{
 private int cid;
 private String cname;
 private String creview;
 public void setCid(int cid)
 {
	 this.cid=cid;
 }
 public int getCid()
 {
	 return cid;
 }
 public void setCname(String cname)
 {
	 this.cname=cname;
 }
 public String getCname()
 {
	 return cname;
 }
 public void setCreview(String creview)
 {
	 this.creview=creview;
 }
 public String getCreview()
 {
	 return creview;
 }
}
public class HotelReviewSystem
{
 public static void main(String x[])
 {
	int ch;
	Hotel H[]=new Hotel[2];
	Customer C[]=new Customer[3];
   	Scanner sc=new Scanner(System.in);  
    do
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("case 1---->Add Hotel and Add new Customer in hotel");
	   	System.out.println("case 2---->View all hotels with his customer details");
		System.out.println("case 3---->Search hotel by its name");
		System.out.println("case 4---->Show hotel wise review");
		System.out.println("Enter Choice");
		ch=sc.nextInt();
		System.out.println("----------------------------------------------------------");
		switch(ch)
		{
			case 1:
			{
				 for(int i=0;i<2;i++)
				 {
					 H[i]=new Hotel();
					 System.out.println("Enter hotel detail with 5 customer data");
					 
					 int id=sc.nextInt();
					 sc.nextLine();
					 String name=sc.nextLine();
					 String type=sc.nextLine();
					 
					 H[i].setid(id); 
					 H[i].setname(name); 
					 H[i].settype(type); 
				
				       for(int j=0;j<3;j++)
				       {
						   C[j]=new Customer();
							System.out.println("Enter customer id, name, review");
							int cid=sc.nextInt();
							sc.nextLine();
							String cname=sc.nextLine();
							String creview=sc.nextLine();
							
							C[j].setCid(cid);
							C[j].setCname(cname);
							C[j].setCreview(creview);
				       }  
					 H[i].setCustomer(C);  
					System.out.println("------------------------------");   
				 }				
			 break;
			}
			case 2:
			{
			 	System.out.println("Hotel with their customer details");
				//System.out.println("**********************************************");
				for(int i=0;i<2;i++)
				{
					System.out.println("===========================================");
					System.out.println(H[i].getid());	
					System.out.println(H[i].getname());	
					System.out.println(H[i].gettype());
					System.out.println("===========================================");  
					for(int j=0;j<3;j++)
					{
					  System.out.printf("%d\t%s\t%s\n",C[j].getCid(),C[j].getCname(),C[j].getCreview());	
					}	
				}
			 break;
			}
			case 3:
			{
				String Sname;
				System.out.println("Enter name to search hotel");
				Sname=sc.next();
				for(int i=0;i<2;i++)
				{
					if(Sname.equals(H[i].getname()))
					{
						System.out.println(H[i].getname()+ " Hotel Found");
						break;
					}
					else
					{
						System.out.println("Hotel not found");
					}	
				}
			 break;
			}
			case 4:
			{
			    System.out.println("Hotel wise reviews are :");	
				for(int i=0;i<2;i++)
				{
					System.out.println(H[i].getname());
					for(int j=0;j<3;j++)
					{
						System.out.println(C[j].getCreview());
					}
				}	
			 break;	
			}
			default:
			{
				System.out.println("Wrong choice");
			}
		}
	}while(ch!=0);
 }
}






