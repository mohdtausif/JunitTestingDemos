package com.tausif.junitexample.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tausif.junitexample.AppTest;
import com.tausif.junitexample.AppTestResult;

@RunWith(Suite.class)
@SuiteClasses({AppTest.class, AppTestResult.class})
public class JunitTestSuite {

}
