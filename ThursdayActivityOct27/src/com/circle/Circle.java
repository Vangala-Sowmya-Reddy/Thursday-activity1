package com.circle;

public class Circle {
	public double center;
	public double radius;
	private static int count=0;
	Circle()
	{
		
		
	}
	Circle(double center,double radius)
	{
		
		this.center=center;
		this.radius=radius;
		count ++;
	}

	public static void main(String[] args) {
		Circle c1=new Circle(2.0,6.5);
		Circle c2=new Circle(3.7,8.7);
		System.out.println("Circle 1 center and radius is:");
		System.out.println("Center:"+c1.center+" ,Radius:"+c1.radius+"cm");
		System.out.println("Circle 2 center and radius is:");
		System.out.println("Center:"+c2.center+",Radius:"+c2.radius+"cm");
		System.out.println("number of circles is:"+Circle.count);
	}

}
