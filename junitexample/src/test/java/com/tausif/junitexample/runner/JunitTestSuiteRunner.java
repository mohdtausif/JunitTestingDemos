package com.tausif.junitexample.runner;

import com.tausif.junitexample.AppTest;
import com.tausif.junitexample.AppTestResult;

import junit.framework.*;

public class JunitTestSuiteRunner {
	
	public static void main(String... args)
	{
		TestSuite testSuite=new TestSuite(AppTest.class, AppTestResult.class);
		TestResult testResult=new TestResult();
		testSuite.run(testResult);	
		System.out.println("Number of test cases = " + testResult.runCount());
	}
	
	
}
