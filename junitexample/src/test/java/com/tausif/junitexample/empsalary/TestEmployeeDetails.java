package com.tausif.junitexample.empsalary;

import org.junit.Test;

import junit.framework.TestCase;

public class TestEmployeeDetails extends TestCase{
	EmployeeDetails employeeDetails;
	EmpBusinessLogic empBusinessLogic;

	@Override
	protected void setUp() throws Exception 
	{
		employeeDetails=new EmployeeDetails();
		employeeDetails.setName("Tausif");
		employeeDetails.setAge(30);
		empBusinessLogic=new EmpBusinessLogic();
		super.setUp();
	}
	
	@Test
	public void testCalculateYearlySalary()
	{
		employeeDetails.setMonthlySalary(25000);
		assertEquals(300000d, empBusinessLogic.calculateYearlySalary(employeeDetails));
	}
	
	@Test
	public void testCalculateAppraisal()
	{
		employeeDetails.setMonthlySalary(25000);
		assertEquals(1000d, empBusinessLogic.calculateAppraisal(employeeDetails));
		employeeDetails.setMonthlySalary(9000);
		assertEquals(500d, empBusinessLogic.calculateAppraisal(employeeDetails));
	}
}
