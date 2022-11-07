package com.innerclass;
class OuterInner
{
	private int value=1000;
	void dispaly()
	{
		class Local{
			int data=500;
			void show()
			{
				System.out.println(value);
				System.out.println(data);
			}
		}
		Local lobj= new Local();
		lobj.show();
	}
}

public class TestLocalInner {

	public static void main(String[] args) {
		OuterInner o=new OuterInner();
		o.dispaly();
		

	}

}
