package com.swapping;

public class Swap {
	private int a,b;
	public Swap(int m,int n)
	{
		a=m;
		b=n;
	}
	public void swap(Swap object)
	{
	int temp;
	temp =object.a;
	object.a=object.b;
	object.b=object.a;
	}
	

	public static void main(String[] args) {
		Swap value=new Swap(56,89);
		System.out.println("values before swapping:"+"a= "+value.a+"; b= "+value.b);
		value.swap(value);
		System.out.println("values after swapping:"+"a= "+value.a+"; b= "+value.b);

	}

}
