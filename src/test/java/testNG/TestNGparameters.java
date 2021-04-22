package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparameters {
	
	
	@Test
	@Parameters({"firstName", "lastName"})
	public void test(String fname, String lname) {
		
		System.out.println("first name: " +fname);
		System.out.println("last name: " +lname);
	}

}
