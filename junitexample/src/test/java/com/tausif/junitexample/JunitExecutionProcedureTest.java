package com.tausif.junitexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitExecutionProcedureTest {
	@Test
	public void testCase1()
	{
		System.out.println("testCase1");
		assertEquals(true, true);
	}
	@Test
	public void testCase2()
	{
	System.out.println("testCase2");
	assertEquals(true, true);
	}
	@Test
	public void testCase3()
	{
		System.out.println("testCase3");
		assertEquals(true, false);
	}
	@Test
	public void testCase4()
	{
		System.out.println("testCase4");
		assertEquals(true, false);
	}
	@Test
	public void testCase5()
	{
		System.out.println("testCase5");
		assertEquals(true, true);
	}
}
