package com.staticclass;

 class Outer {
	private static int value=100;
	static class InnerStaticClass1
	{
		void display()
		{
			System.out.println(value);
		}
		public static void main(String[] args) {
			Outer.InnerStaticClass1 obj=new Outer.InnerStaticClass1();
					obj.display();
		
	    }
	

	
		
	}

}
