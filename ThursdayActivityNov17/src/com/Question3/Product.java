package com.Question3;
import java.util.*;

class MyException extends Exception
{
	public MyException(String str)
	{
		super(str);
	}
}

public class Product {

	//int weight;
		 void productCheck(int weigth) throws MyException
		{
			//int weigth =0;
			if(weigth < 100)
				{
					throw new MyException ("It is not a valid product");
				}
				else{
					System.out.println("product is valid "+weigth);
				}	
			}
		public static void main(String args[]) throws MyException
			{
				Product p=new Product();
				try
				{
					p.productCheck(30);
				}
				catch(MyException e)
				{
					System.out.println("Cought My Exception");
					System.out.println(e.getMessage());
				}
			}

	}


