import java.util.*;
class Vehicle
{
 String Model;
 int Rno;
 int Speed;
 int Fuel;
 int Fcons;
 int Fneeded;
 int Distance;
 Vehicle(String Model,int Rno,int Speed,int Fuel,int Fcons)
 {
	this.Model=Model;
	this.Rno=Rno;
	this.Speed=Speed;
	this.Fuel=Fuel;
	this.Fcons=Fcons;
 }
	void fuelNeeded(int distance)
	 {
		Fneeded=distance*Fcons; 
	 }
	 int DistanceCovered(int time)
	 {
		Distance=Speed*time;
        return Distance;		
	 }
	 void display()
	 {
		System.out.println("Model of vehicle " +Model); 
		System.out.println("Registration of vehicle " +Rno); 
		System.out.println("Speed of vehicle " +Speed); 
		System.out.println("Fuel in vehicle " +Fuel); 
		System.out.println("Fuel Consumption of vehicle " +Fcons); 	
		System.out.println("Fuel needed for vehicle " +Fneeded); 
		System.out.println("Distance covered by vehicle " +Distance); 
	 }
 }
class Bus extends Vehicle
{
  int passangers;
  Bus(String Model,int Rno,int Speed,int Fuel,int Fcons,int passangers)
  {
	super(Model,Rno,Speed,Fuel,Fcons); 
	this.passangers=passangers;
  }	
    void display()
    {
	  super.display();
	  System.out.println("No of passangers are " +passangers);
    }
}
class Truck extends Vehicle
{
 int CargoWeight;
 Truck(String Model,int Rno,int Speed,int Fuel,int Fcons,int CargoWeight)
 {
	super(Model,Rno,Speed,Fuel,Fcons);
    this.CargoWeight=CargoWeight;
 }
    void display()
	{
		super.display();
		System.out.println("Cargo Weight is " +CargoWeight);
	}	
}
public class Transport
{
 public static void main(String x[])
 {
   String mod;
   int r,s,f,fc,ch,D,P,T,W;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter model");
   mod=sc.nextLine();
   sc.nextLine();
   System.out.println("Enter Registration number");
   r=sc.nextInt();
   System.out.println("Enter Speed");
   s=sc.nextInt();
   System.out.println("Enter Fuel capacity");
   f=sc.nextInt();
   System.out.println("Enter Fuel Consumption");
   fc=sc.nextInt();
   System.out.println("Enter distance");
   D=sc.nextInt();
   System.out.println("Enter time");
   T=sc.nextInt();
   System.out.println("Enter total no of passangers");
   P=sc.nextInt();
   System.out.println("Enter Weight");
   W=sc.nextInt();

	   Bus B=new Bus(mod,r,s,f,fc,P);
	   B.fuelNeeded(D);
	   B.DistanceCovered(T);
	   B.display();
       System.out.println("***********************************");
       Truck t=new Truck(mod,r,s,f,fc,W);
	   t.fuelNeeded(D);
	   t.DistanceCovered(T);
	   t.display();
  }
}
