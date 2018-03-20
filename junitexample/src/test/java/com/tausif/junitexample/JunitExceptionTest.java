package com.tausif.junitexample;

import org.junit.Test;

public class JunitExceptionTest {

	@Test(expected=ArithmeticException.class)
	public void testExceptionPositive()
	{
		int a= 10/0;
	}
	
	@Test(expected=ArithmeticException.class)
	public void testExceptionNegative()
	{
		int a= 10/1;
	}
}
