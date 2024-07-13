//
abstract class Animal
{
  public abstract void sound();
}
class Lion extends Animal
{
	public void sound()
	{
		System.out.println("Lion roars");
	}
}
class Tiger extends Animal
{
	public void sound()
	{
	   System.out.println("Tiger roars");
	}
}
public class Abstraction1
{
 public static void main(String x[])
 {
   Animal T=new Tiger();
   T.sound();
   Animal L=new Lion();
   L.sound();
 }
}