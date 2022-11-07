package com.superkeyword;
class Person
{
	String name;
	int id;
	Person(String n,int i)
	{
		name=n;
		id=i;
	}
}
class Employee extends Person
{
	double salary;
	Employee(String n,int i,double d)
	{
		super(n,i);
		salary=d;
	}
	void display()
	{
		System.out.println(name+" "+id+" "+salary);
	}
	
	
}

public class TestSuper2 {

	public static void main(String[] args) {
		Employee e=new Employee("sowmya",657,1000000.00);
		e.display();
	}

}
