package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import core.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObj.HotelPageObject;
import utilities.DriverUtility;

public class HotelLoginTest extends Base {

	// I need to declare object of HotelPageObject

	HotelPageObject hotelpb;

	@BeforeMethod
	public void beforeMethod() {
		initializeDriver();
		logger.info("Broswer opened successfully");
	}

	@AfterMethod
	public void afterMethod() {
		tearDown();
		logger.info("Broswer Closed");
	}

	@Test(enabled = true)
	@Parameters({ "userName", "password" })
	public void loginToHotelTestOne(String userName, String password) {
		hotelpb = new HotelPageObject();

		SoftAssert softAssert = new SoftAssert();

		softAssert.assertTrue(hotelpb.signInIsPresent());
		hotelpb.clickOnSignIn();
		softAssert.assertTrue(hotelpb.emailAddressIsPresent());
		softAssert.assertTrue(hotelpb.passwordIsDisplayed());
		softAssert.assertTrue(hotelpb.forgotPasswordLinkIsDisplayed());
		softAssert.assertTrue(hotelpb.signInIsDisplayed());
		DriverUtility.screenShot();
		hotelpb.SignInMethod(userName, password);
		softAssert.assertTrue(hotelpb.myAccountTextIsDisplayed());
		softAssert.assertAll();
		DriverUtility.screenShot();

	}

	/*
	 * @Test
	 * 
	 * @Parameters({"email", "fName", "lName", "password"}) public void
	 * loginToHotelTest(String email, String fName, String lName, String password) {
	 * 
	 * hotelpb = new HotelPageObject(); SoftAssert softAssert = new SoftAssert();
	 * 
	 * softAssert.assertTrue(hotelpb.signInIsPresent()); hotelpb.clickOnSignIn();
	 * DriverUtility.screenShot(); //hotelpb.enterEmaolSignInMethod(userName,
	 * password); hotelpb.enterEmail(email); hotelpb.clickonCreate();
	 * hotelpb.formfillout(fName, lName, password);
	 * softAssert.assertTrue(hotelpb.myAccountTextIsDisplayed());
	 * softAssert.assertAll(); DriverUtility.screenShot();
	 * 
	 * }
	 */

}
