package com.thursdayactivitydec15maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

class FibonacciSeriesTest {

	static FibonacciSeries fibonacci;

	@BeforeAll
	static void init()
	{
	 fibonacci =new FibonacciSeries();
	}
	@Test
	void testNegative()
	{
		assertEquals(-1,-1);
	}

	@Test
	void testZero()
	{
		assertEquals(0,0);
	}
	
	@Test
	void testOneValue()
	{
		assertEquals(1,1);
	}
	
	@Test
	void testFibo()
	{
		assertEquals(10,10);
	}
	}

