class ABC
{
	private static ABC a=null;     //stores default value null in static variable
	public static ABC ab()
	{
		//if(a==null)    //addesss
	//	{
		a=new ABC();
		System.out.println("hello");
		//}
		return a;   //address
	}
}

public class SingleTone
{
 public static void main(String x[])
 {
	 ABC a1=ABC.ab();    //a=ABC.ab();
	 System.out.println(a1.hashCode());
	 ABC a2=ABC.ab();
	 	 System.out.println(a2.hashCode());
		 ABC a3=ABC.ab();
		 	 System.out.println(a3.hashCode());

 }
}