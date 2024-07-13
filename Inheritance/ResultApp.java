import java.util.*;
class Per
{
 public int per;
 void CalPer(int s[])
 {
   int sum=0;
   for(int i=0;i<6;i++)
   {
	 sum=sum+s[i];  
   }	   
   System.out.println(sum);
   per=sum/6;
   System.out.println(per);
 }
}
class CSE extends Per
{
  int id;
  String name,address,year;
  CSE(int id,String name,String address,String year)
  {
  this.id=id;
  this.name=name;
  this.address=address;
  this.year=year;
  }
   void showCsePer()
   {
    System.out.println("CSE percentage is " +per);
   }
}
class ETC extends Per
{
  int id;
  String name,address,year;
 ETC(int id,String name,String address,String year)
 {
  this.id=id;
  this.name=name;
  this.address=address;
  this.year=year; 
 }
  void showETCPer()
  {
    System.out.println("ETC percentage is " +per);
  }
}
public class ResultApp
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int ch;
  int m[]=new int[6];
  
  int Id;
  String Name,Address,Year;
  System.out.println("Enter id");
  Id=sc.nextInt();
  
  System.out.println("Enter name");
  sc.nextLine();
  Name=sc.nextLine();
  
  System.out.println("Enter address");
  Address=sc.nextLine();
  
  System.out.println("Enter year");
  Year=sc.nextLine();
  
  System.out.println("Enter marks of 6 subjects");
  for(int i=0;i<6;i++)
  {
	m[i]=sc.nextInt();  
  }	
 
 CSE C=new CSE(Id,Name,Address,Year); 
 C.CalPer(m);
 C.showCsePer();
 
 ETC E=new ETC(Id,Name,Address,Year);
 E.CalPer(m);
 E.showETCPer();
 }
}






