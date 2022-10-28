package com.student;

import java.util.Scanner;

public class Student {
 private String name;
 private int age;
 private float weight;
 private static int count=0;
 public Student()
 {
	 count++;
 }
public void getinfo()
 {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the name of the student:");
	 String name=sc.next();
	 this.name=name;
	 System.out.println("Enter the age of the student:");
	 int age=sc.nextInt();
	 this.age=age;
	 System.out.println("Enter the weight of the student:");
	 float weight=sc.nextFloat();
	 this.weight=weight;
	 
 }
public void displayInfo()
{
	System.out.println("Name: "+this.name);
	System.out.println("Age: "+this.age);
	System.out.println("Weight: "+this.weight);
}
public static int getCount()
{
	
	return count++;
}

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		System.out.println("Student 1:");
		s1.getinfo();
		System.out.println("Student 2:");
		s2.getinfo();
		System.out.println("Display Information of Students:");
		System.out.println("Student 1:");
		s1.displayInfo();
		System.out.println("Student 2:");
		s2.displayInfo();
		System.out.println("Number of Students enrolled is:"+Student.getCount());
	}

}
