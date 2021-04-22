package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	// @Test: This annotation will be use to run actual Test method.
	// @BeforeMethod: This annotation will be executed before each test method
	// @AfterMethod: This annotation will be executed after each test method
	// @BeforeTest: This annotation will be executed before all test methods in a
	// single class
	// @AfterTest: This annotation will be executed after all test methods in a
	// single class
	// @Before class: This annotation will be executed before class if we have
	// multiple test Java classes
	// @After Class: This annotation will be executed after class if we have
	// multiple test Java Classes
	// @BeforeGroup and AfterGroup: These annotations will be executed before and
	// after set of test cases.
	// BeforeSuite and AfterSuite: These annotations will be executed before and
	// after suite of tests
	// Most common used annotations in TestNG framework are @Test @BeforeMethod
	// @AfterMethod
	// The reason is @BeforeMethod and @AfterMethod are acting as a hooks
	// Sequence of Execution:
	// BeforeSuite-BeforeClass-BeforeTest-BeforeMethods-Test-AfterMethod-AfterTest-AfterClass-AfterSuite
	// BeforeGroup and AfterGroup :The place for these two annotations are after and
	// before group of test
	// order of execution: A B C
	// Priority
	@Test(priority = 1)
	public void a() {
		System.out.println("this is a test A");
	}

	@Test(priority = 2)
	public void b() {
		System.out.println("this is a test B");
	}

	@Test(priority = 3)
	public void c() {
		System.out.println("this is a test C");
	}

	@Test
	public void d() {
		System.out.println("this is a test D");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this method will execute before each test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this method will execute after each test");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("this method will execute only once before first test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this method will execute only once after last test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("this method will execute before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this method will execute after class");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this method will execute before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("this method will execute after suite");
	}

}
