package testNG;

import org.testng.annotations.Test;

public class TestNGGroups {
	
	public class TestNGgroups {
		@Test (groups = {"smokeTests"})
		public void test() {
			System.out.println("this is part of Smoke test");
		}
		@Test(groups = {"smokeTests"})
		public void testTwo() {
			System.out.println("this is part of Smoke test One");
		}
		@Test(groups = {"RegressionTests"})
		public void testThree() {
			System.out.println("this is part of Regression test");
		}
		@Test(groups = {"RegressionTests"})
		public void testFour() {
			System.out.println("this is part of Regression test one ");
		}
		@Test(groups = {"RegressionTests"})
		public void testFive() {
			System.out.println("this is part of Regression test two");
		}
	}

}
