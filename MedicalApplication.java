//Medical Application
class Customer
{
 private int cid;
 private String cname;
 private String cAddress;
 private String PrescribedByDr;
 private int TotalBill;
 
 public void setcid(int cid)
 {
	 this.cid=cid;
 }
 public int getcid()
 {
	 return cid;
 }
 public String setcname(String cname)
 {
	 this.cname=cname;
 }
 public String getcname
 {
	 return cname;
 }
 public void setcAddress(String cAddress)
 {
	 this.cAddress=cAddress;
 }
 public String getcAddress
 {
	 return cAddress;
 }
 public void setPrescribedByDr(String PrescribedByDr)
 {
	 this.cname=cname;
 }
 public String getPrescribedByDr
 {
	 return PrescribedByDr;
 }
 public void setTotalBill(int TotalBill)
 {
	 this.TotalBill=TotalBill;
 }
 public int getTotalBill()
 {
	 return TotalBill;
 }
}
class Medical
{
	private int pId;
	private String pName;
	private int pPrice;
	private String pType;
	private int tabletinStrips;
	private int expiryDate;
	private int quantity;

	public void setpId(int pId)
    {
	 this.pId=pId;
    }
    public int getpId()
    {
	 return pId;
    }
	public void setpName(String pName)
    {
	 this.pName=pName;;
    }
     public String getpName()
    {
	 return pName;
    }
	public void setpPrice(int pPrice)
    {
	 this.pPrice=pPrice;
    }
    public int getpPrice()
    {
	 return pPrice;
    }	
	public void setpType(String pType)
    {
	 this.pType=pType;
    }
     public String getpType()
    {
	 return pType;
    }
	public void settabletinStrips(int tabletinStrips)
	{
		this.tabletinStrips=tabletinStrips;
	}
	public int gettabletinStrips()
	{
		return tabletinStrips;
	}	
	public void setexpiryDate(int expiryDate)
    {
	 this.expiryDate=expiryDate;
    }
    public int getexpiryDate()
    {
	 return expiryDate;
    }
	public void setquantity(int quantity)
    {
	 this.quantity=quantity;
    }
    public int getquantity()
    {
	 return quantity;
    }
}
public class MedicalApplication
{
	public static void main(String x[])
	{
		struct Medical M[5];
		int ch;
		String username="Admin";
		String password="12345";
		do
		{
		  System.out.println("1--->Add Medical Products");	
		  System.out.println("2--->Add Medical Products");	
		  System.out.println("3--->Add Medical Products");	
		  System.out.println("4--->Add Medical Products");	
		  System.out.println("5--->Add Medical Products");	
		  System.out.println("6--->Add Medical Products");	
		  System.out.println("7--->Add Medical Products");
		  System.out.println("Enter choice");			
          ch=sc.nextInt();
          
           if("Admin".equals(username) && "12345".equals(password))	
		   {
	           swithc(ch)
		       {
				  case 1:
				  {
				   break;
				  }
				  case 2:
				  {
				   break;
				  }
				  case 3:
				  {
				   break;
				  }
				  case 4:
				  {
				   break;
				  }
				  case 5:
				  {
				   break;
				  }
				  case 6:
				  {
				   break;
				  }
				  case 7:
				  {
				   break;
				  }
				  default:
				  {
					  System.out.println("Wrong choice");
				  }
		       }	
		   }
           else
	       {
		     System.out.println("User not found");
	       }
		}while(ch!=0)
	}
}