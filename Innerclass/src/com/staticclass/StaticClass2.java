package com.staticclass;
public class StaticClass1
{
	private static int value=1000;

    public class StaticClass2 {
	static void message()
	{
		System.out.println(value);
	}

	public static void main(String[] args) {
		StaticClass1.StaticClass2.message();
		

	}

}
}
