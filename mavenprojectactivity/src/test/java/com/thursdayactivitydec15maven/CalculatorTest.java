package com.thursdayactivitydec15maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

class CalculatorTest {

	static Calculator c;

	@BeforeAll()
	static void init(){
		c=new Calculator();
	}
	
		
	@Test
	void testAddition()
	{
		int expected=50;
		int actual=c.addition(30, 20);
		assertEquals(expected,actual,"addition of 30 and 20 is 50");
		
	}
	@Test
	void testSubtraction()
	{
		int expected=20;
		int actual=c.subtraction(30, 10);
		assertEquals(expected,actual,"subtraction of 30 and 10 is 20");
		
	}
	@Test
	void testMultiplicaion() {
		int expected=20;
		int actual=c.multiplication(4,5);
		assertEquals(expected,actual,"multiplication of 4 and 5 is 20");
		
	}
	@Test
	void testDivision() {
		int expected=5;
		int actual=c.division(60, 12);
		
		assertEquals(expected,actual,"division of 60 and 12 is 5");
	}
	

}
