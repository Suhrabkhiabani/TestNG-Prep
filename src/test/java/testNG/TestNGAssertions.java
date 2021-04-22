package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {

	// Assertions are used to validate the expected result against the actual
	// TestNG provides two types of assertions

	// 1. Hard Assertion : if expected result is not equal to actual then execution
	// will stop
	// 2. Soft Assertion : if expected result is not equal to actual then execution
	// will continue
	// and at the end of execution test will be failed.

	@Test (enabled=false) // this will ignore the test from execution
	public void hardAssertion() {
		int actualValue = 10;
		int expectedValue = 10;

		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("This line will execute if assertion passed");
	}

	@Test
	public void SoftAssertion() {
		
		// TestNG provides a class called SoftAssert and we create object of soft SoftAssert.
		// then we use methods provided by this class
		// Once all assertions are written we have to call assertAll() method. 
		int a = 10;
		int b = 10;
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(a, b);
		System.out.println("This line of code will be executed regardless of pass or faill");
		softAssert.assertTrue(true);
		System.out.println("This is after scond Assertion");
		softAssert.assertTrue(true);
		System.out.println("This is after 3rd Assertion");
		
		softAssert.assertAll();

	}

}
