//
import java.util.*;
class Student
{
 private int id;
 private String name,contact,address,email;
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
 public void setContact(String c)
 {
	contact=c; 
 }
 public String getContact()
 {
	return contact; 
 }
 public void setAddress(String a)
 {
	address=a; 
 }
 public String getAddress()
 {
	return address; 
 }
 public void setEmail(String e)
 {
	email=e; 
 }
 public String getEmail()
 {
	return email; 
 }
}
class Sem
{
	private int sub[];
	void setSub(int sub[])
	{
		this.sub=sub;
	}
	int[] getSub(int size)
	{
		
	}
}
class Year
{
	private int id;
	private int yearname;
	private int sem;
	public void setID(int ID)
	{
		id=ID;
	}
	public int getID()
	{
		return id;
	}
	public void setNAME(String N)
	{
		yearname=N;
	}
	public String getNAME()
	{
		return yearname;
	}
	public void setSEM(int ...s)
	{
		sem=s;
	}
	Sem int[] getSEM()
	{
		return sem;
	}
}
class Result
{
  Student s;
  Year y[];  
  void setYear(Student s, Year...y)
  {
	  this.s=s;
	  this.y=y;
  }
  void generateMarksheet()
  {
	  
  }  
}