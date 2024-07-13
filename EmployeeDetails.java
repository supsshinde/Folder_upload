//Employee
import java.util.*;
class Employee
{
  private int id;
  private int salary;
  private String name;
  public void setId(int id)
  {
	this.id=id;  
  }
  public int getId()
  {
	  return id;
  }
  public void setSalary(int salary)
  {
	this.salary=salary;  
  }
  public int getSalary()
  {
	  return salary;
  }
  public void setName(String name)
  {
	this.name=name;  
  }
  public String getName()
  {
	  return name;
  }
}
public class EmployeeDetails
{
 public static void main(String x[])
 { 
 Scanner sc=new Scanner(System.in);
 
 System.out.println("Enter id");
 int Eid=sc.nextInt();
 
 System.out.println("Enter salary");
 int Esalary=sc.nextInt();
 
 System.out.println("Enter name");
 sc.nextLine();
 String Ename=sc.nextLine();
 
 Employee E=new Employee();
 E.setId(Eid);
 E.setSalary(Esalary);
 E.setName(Ename);
 
 System.out.println("Employee Details are :");
 System.out.println("Id= " +E.getId());
 System.out.println("Name= " +E.getName());
 System.out.println("Salary= " +E.getSalary());
 }
}