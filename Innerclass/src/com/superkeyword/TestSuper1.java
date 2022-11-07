package com.superkeyword;


	class Vehicle
	{
		String colour="Black";
		void start()
		{
			System.out.println("Start the Vehicle");
		}
		Vehicle()
		{
			System.out.println("This is Vehicle constructor");
		}
	}
class Bus extends Vehicle
{
	String colour="Red";
	Bus()
	{
		super();
		System.out.println("This is Bus constructor");
	}
	void brake()
	{
		System.out.println("brake is to stop");
		System.out.println("Bus colour is "+colour);//or we can use "this.colour" also in the place of colour
		System.out.println("Vehicle colour is "+super.colour);
		super.start();
		
	}
}
public class TestSuper1 {
	public static void main(String[] args) {
		Bus obj=new Bus();
		obj.start();
		obj.brake();
	}

}


