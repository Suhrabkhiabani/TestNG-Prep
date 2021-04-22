package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class HotelPageObject extends Base {
	// We are following POM design pattern 
		// We are implementing PageFactory class 
		//we are using .initElement method to initialize the UI Elements 
	
		public HotelPageObject() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(xpath ="//span[contains(text(),'Sign in')]")
		private WebElement signIn;
		@FindBy(id = "email")
		private WebElement emailAddress;
		@FindBy(id ="passwd")
		private WebElement password;
		@FindBy(xpath ="//a[contains(text(),'Forgot your password?')]")
		private WebElement forgotPasswordLink;
		@FindBy(xpath ="//button[@name='SubmitLogin']/span")
		private WebElement signInButton;
		@FindBy(xpath="//h1[contains(text(),'My account')]")
		private WebElement myAccountText;
		
		
		public void SignInMethod(String userName, String pass) {
			emailAddress.sendKeys(userName);
			password.sendKeys(pass);
			signInButton.click();
		}
		public void clickOnSignIn() {
			signIn.click(); 
		}
		public boolean signInIsPresent() {
			return signIn.isDisplayed();
		}
		public boolean emailAddressIsPresent() {
			return emailAddress.isDisplayed();
		}
		public boolean passwordIsDisplayed() {
			return password.isDisplayed();
		}
		public boolean forgotPasswordLinkIsDisplayed() {
			return forgotPasswordLink.isDisplayed();
		}
		public boolean signInIsDisplayed() {
			return signInButton.isDisplayed();
		}
		public boolean myAccountTextIsDisplayed() {
			return myAccountText.isDisplayed();
		}
		
		/*@FindBy(xpath ="//input[@id='email_create']")
		private WebElement enterEamailAddress;
		
		@FindBy( xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]")
		private WebElement createAccount;
		
		@FindBy(xpath = "//input[@id='id_gender1']")
		private WebElement mrBTN;
		
		@FindBy(xpath= "//input[@id='customer_firstname']")
		private WebElement fName;
		
		@FindBy(xpath = "//input[@id='customer_lastname']")
		private WebElement lName;
		
		@FindBy(xpath = "//input[@id='passwd']")
		private WebElement passworD;
		
		@FindBy(xpath = "//select[@id='days']")
		private WebElement day;
		
		@FindBy (xpath = "//select[@id='months']")
		private WebElement month;
		
		@FindBy (xpath = "//select[@id='years']")
		private WebElement year;
		
		@FindBy (xpath = "//input[@id='newsletter']")
		private WebElement signInBTN;
		
		@FindBy (xpath = "//input[@id='optin']")
		private WebElement receiveOffer;
		
		@FindBy (xpath = "//button[@name='submitAccount']")
		private WebElement register;
		
		public void enterEmail(String enteremail) {
			enterEamailAddress.sendKeys(enteremail);
			
		}
		
		public void clickonCreate() {
			createAccount.click();
		}
		
		public void formfillout(String ffName, String llName, String passwordd) {
			mrBTN.click();
			fName.sendKeys(ffName);
			lName.sendKeys(llName);
			passworD.sendKeys(passwordd);
			DriverUtility.selectCalendarDateWithJS("7", day);
			DriverUtility.selectCalendarDateWithJS("10", month);
			DriverUtility.selectCalendarDateWithJS("1990", year);
			signIn.click();
			receiveOffer.click();
			register.click();*/
		
		
		}


