//pojo class example1
import java.util.*;
class Product
{
 private int id;
 private int price;
 private String name;
 public void setId(int i)
 {
  id=i;
 }
 public int getId()
 {
  return id;
 }
 public void setName(String n)
 {
  name=n;
 }
 public String getName()
 {
  return name;
 }
 public void setPrice(int p)
 {
  price=p;
 }
 public int getPrice()
 {
  return price;
 }
}
class Shop
{
  Product prod;
  public void setProduct(Product p)
  {
   prod=p;
  }
  void getProduct()
  {
    System.out.println("Product id is  " +prod.getId());
	System.out.println("Product name is  " +prod.getName());
    System.out.println("Product price is  " +prod.getPrice());
  }
}
public class ShopApplication
{
	public static void main(String x[])
	{	
		 int id,price;
		 String name;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter id");
		 id=sc.nextInt();
		 System.out.println("Enter name");
		 sc.nextLine();
		 name=sc.nextLine();
		 System.out.println("Enter price");
		 price=sc.nextInt();
		 Product p=new Product();
		 p.setId(id);
		 p.setName(name);
		 p.setPrice(price);
		 Shop s=new Shop();
		 s.setProduct(p);
		 System.out.println("All details are :");
		 s.getProduct();
	}
}