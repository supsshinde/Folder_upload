import java.util.*;

 abstract class Parent
 {
     public abstract void ParentMethod(int x); //10
	 
 
    public void display()
	{
		 System.out.println("I am display Parent class");
		
	}
 }
  class Student extends Parent
  {
 
      public void ParentMethod(int x)
	 {
	 	    System.out.println("I am child class"+x);

	 
	 }
  }
  
    public class CodeRunner
	{
	   public static void main(String ...args)
	   {
	   
	         Parent p = new Student();
			   p.ParentMethod(10);
	           p.display(); 
	   }
	
	}
  