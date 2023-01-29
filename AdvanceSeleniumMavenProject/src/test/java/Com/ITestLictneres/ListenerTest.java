package Com.ITestLictneres;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Com.ITestLictneres.Listeners.class)
public class ListenerTest {

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Beore Methods");
	}

	@Test
	public void f1() {
		
		System.out.println("Test  -2");
		Assert.assertEquals(false, true);
		System.out.println("Test end");
		
	}
	@Test
	public void f2() {
		System.out.println("Test  -3");
	}
	@Test
	public void f() {
		System.out.println("Test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Methods");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
