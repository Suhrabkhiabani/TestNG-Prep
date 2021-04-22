package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDependentConcept {
	
	// DependsOnMethod: we use it for reducing the failure and skip if previous test
		// failed.
		@BeforeTest
		public void openBrowser() {
			System.out.println("This method will open browser");
		}
		@Test(priority = 1)
		public void testLogin() {
			System.out.println("This is login test");
			boolean a = false;
			 Assert.assertTrue(a);
		}
		@Test(priority = 2, dependsOnMethods = { "testLogin" })
		public void testLogOut() {
			System.out.println("This is log out test");
		}
		@AfterTest
		public void tearDown() {
			System.out.println("this method will close browser");
		}

}
