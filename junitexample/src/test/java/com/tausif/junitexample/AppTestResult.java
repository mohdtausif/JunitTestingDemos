package com.tausif.junitexample;

import static org.junit.Assert.assertEquals;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestResult;

public class AppTestResult extends TestResult{

	@Override
	public synchronized void addError(Test test, Throwable e) {
		super.addError(test, e);
	}
	
	@Override
	public synchronized void addFailure(Test test, AssertionFailedError e) {
		super.addFailure(test, e);
	}
	
	@org.junit.Test
	public void testAdd()
	{
		assertEquals(true, true);
	}
	
	@Override
	public synchronized void stop() 
	{
		super.stop();
	}
}
