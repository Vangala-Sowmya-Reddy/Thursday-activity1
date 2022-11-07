package com.inheritence;
class Vehicle1
{
	String model="pulsar 180";
	void drive()
	{
		System.out.println("vehicle is under driving");
		}
}
class Bike extends Vehicle
{
	void brake()
	{
		System.out.println("stop the vehicle");
	}
}
class Bicycle extends Bike
{
	void ride()
	{
	System.out.println("my new bicycle");
	}
}

public class MultilevelInheritence {

	public static void main(String[] args) {
		Bicycle byobj=new Bicycle();
		byobj.ride();
		byobj.brake();
		byobj.drive();
		Bike bobj=new Bike();
		bobj.brake();
		bobj.drive();
		bobj=byobj;//
		Vehicle1 vobj=new Vehicle1();
		vobj.drive();

	}

}
