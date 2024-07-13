//calculate cube og number
import java.util.*;
class Cube
{
 int x;
 void setValue(int x)
 {
	this.x=x; 
 }
 int getCube()
 {
	int y=x*x*x;
    return y;
 }
}
public class CalculateCube
{
 public static void main(String x[])
 {
	int no;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	no=sc.nextInt();
	Cube c=new Cube();
	c.setValue(no);
	int y=c.getCube();
	System.out.println("Cube of number is " +y);
 }
}