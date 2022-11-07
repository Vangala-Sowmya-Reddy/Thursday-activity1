package com.inheritence;
class Vehicle
{
	String model="pulsar 180";
	void drive()
	{
		System.out.println("vehicle is under driving");
		}
}
class Bikee extends Vehicle
{
	void brake()
	{
		System.out.println(" stop the vehicle");
	}
}

public class SingleInheritence {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		Bikee b=new Bikee();
		v.drive();
		b.drive();
		b.brake();
		System.out.println(b.model);

	}

}

