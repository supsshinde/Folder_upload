import java.util.*;
class Rectangle
{
 int length,breadth;
 Rectangle()
 {
  System.out.println(length);
  System.out.println(breadth);
 }
 Rectangle(int l)
 {
  length=l;
  breadth=l;
  System.out.println("Area of rectangle is " +(length*breadth));
 }
 Rectangle(int lenght, int breadth)
 {
  this.length=length;
  this.breadth=breadth;
  System.out.println("Area of rectangle is " +(lenght*breadth));
 }
}
public class CalAreaRectangle
{
 public static void main(String x[])
 {
  int a,b;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter values");
  a=sc.nextInt();
  b=sc.nextInt();
  Rectangle R1=new Rectangle();
  Rectangle R2=new Rectangle(a);
  Rectangle R3=new Rectangle(a,b);
 }
}