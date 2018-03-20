package com.tausif.junitexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTimeTest {
	@Test(timeout=100)
	public void testTimeOutPositiveTest()
	{
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		assertEquals(true, true);
	}
	
	@Test(timeout=100)
	public void testTimeNegativeTest()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		assertEquals(true, true);
	}
}
