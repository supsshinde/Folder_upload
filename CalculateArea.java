//Calculate area using constructor overloading
import java.util.*;
class Area
{
 Area(float radius)
 {
   float area=3.14f*radius*radius;    
   System.out.println("Area of circle is" +area);
 }
 Area(int len, int width)
 {
   int ar=len*width;
   System.out.println("Area of rectangle is" +ar);
 }
}
public class CalculateArea
{
 public static void main(String x[])
 {
  int l,b;
  float r;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter length");
  l=sc.nextInt();
  System.out.println("Enter width");
  b=sc.nextInt();
  System.out.println("Enter radius");
  r=sc.nextFloat();
  Area a1=new Area(r);
  Area a2=new Area(l,b);
 } 
}