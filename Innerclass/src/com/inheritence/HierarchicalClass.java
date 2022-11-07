package com.inheritence;
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Cat extends Animal
{
String colour="white";
void sound()
{
	System.out.println("meow meow meowwwwwwwwwww");
}
}
class Dog extends Animal
{
	int n=2;
	void sound() {
		System.out.println("bow bow bowwwwwwww");
	}
}

public class HierarchicalClass {

	public static void main(String[] args) {
		Cat c=new Cat();
		System.out.println("colour of cat is"+c.colour);
		c.eat();
		c.sound();
		Dog d=new Dog();
		System.out.println("Number of ears of dog is "+d.n);
		d.eat();
		d.sound();
		
		
		
		
		
		
	}

}
