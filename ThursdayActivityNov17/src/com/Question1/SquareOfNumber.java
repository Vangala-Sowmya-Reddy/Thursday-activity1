package com.Question1;
import java.util.Scanner;
public class SquareOfNumber {
	void Square(int a)throws OutOfRangeException
	{
		//int num;
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		if(num1 > 10 && num1 < 50)
		
			throw new OutOfRangeException("It is Out Of range");
			//System.out.println("Out of range");
		
		else
			
			throw new OutOfRangeException("Square is: "+num1*num1);
		
	}
		public static void main(String []args) throws OutOfRangeException
		{
			SquareOfNumber e=new SquareOfNumber();
			try
			{
				e.Square(1);
			}
			catch(Exception e1)
			{
			System.out.println(e1);
			}
		}
}
