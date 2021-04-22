package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {

	@Test (priority = 2)
	public void testOne() {
		System.out.println("This is test One");
	}
	
	@Test (priority = 1)
	public void testTwo() {
		System.out.println("this is test Two");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is afterMethod");
	}
	
}
