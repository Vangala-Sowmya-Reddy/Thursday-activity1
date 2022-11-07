package com.innerclass;
abstract class Employee{

	abstract void displaydetails();
}


public class AbstractClass {  //this is anonymous inner class

	public static void main(String[] args) {
		
		Employee e=new Employee(){
		
			void displaydetails()
			{
				System.out.println("Giving Employee details through Anonymous inner class");
			}
		};
		e.displaydetails();
	}

	}
