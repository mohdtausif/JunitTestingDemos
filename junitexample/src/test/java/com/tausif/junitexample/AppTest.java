package com.tausif.junitexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class AppTest
{
	@Test
	public void testAddPositive() 
	{
		String str= "Junit is working fine"; 
		assertEquals("Junit is working fine",str);
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("beforeTest()");
	}
	
	@BeforeClass
	public static void beforeTestClass()
	{
		System.out.println("beforeTestClass()");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("afterTest()");
	}
	
	@AfterClass
	public static void afterTestClass()
	{
		System.out.println("afterTestClass()");
	}
	
	@Ignore
	public void testIgnoreMe()
	{
		assertEquals(true, false);
	}
}
