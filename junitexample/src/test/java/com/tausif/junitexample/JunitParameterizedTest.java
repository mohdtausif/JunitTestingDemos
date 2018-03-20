package com.tausif.junitexample;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JunitParameterizedTest {
	PrimeNumberChecker primeNumberChecker;
	Integer inputNumber;
	Boolean expectedResult;
	public JunitParameterizedTest(Integer inputNumber,Boolean expectedResult)
	{
		this.inputNumber=inputNumber;
		this.expectedResult=expectedResult;
	}
	
	@Before
	public void initialize() 
	{
		primeNumberChecker = new PrimeNumberChecker(); 
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() 
	{
		return Arrays.asList(new Object[][] 
			{ 
				{ 2, true },
				{ 6, false },
				{ 19, true },
				{ 22, false },
				{ 23, true }
	    	});
	}
	
	@Test
	public void testPrimeNumberChecker() 
	{
		System.out.println("Parameterized Number is : " + inputNumber); 
		assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
	}
}
