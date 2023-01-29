package Com.cjc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MerTest {

WebDriver driver;

	
	@BeforeSuite(groups = "Run")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Alljar\\\\Chrome Driver\\\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@BeforeTest(groups = "NotRun")
	public void window() {
		driver.manage().window().maximize();
	}

	@Parameters({"url"})
	@BeforeClass(groups = "Run")
	public void openWebPage(String url) {
		driver.get(url);
	}

	@BeforeMethod(groups = "NotRun")
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Parameters({"userName","password"})
	@Test(groups = "Run")
	public void login(String un, String ps) {
		driver.findElement(By.name("userName")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.name("submit")).click();
	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { new Object[] { "QQQQ", "qqqq" }, new Object[] { "AAAA", "aaaa" },
				new Object[] { "BBBB", "bbbb" }, };
	}

//	@DataProvider
//	public Object[][] getData()
//	{
//		Object obj[][]=new Object[3][2];
//		obj[0][0]="QQQQ";
//		obj[0][1]="qqqq";
//		obj[1][0]="AAAA";
//		obj[1][1]="aaaa";
//		obj[2][0]="BBBB";
//		obj[2][1]="bbbb";
//		
//		return obj;
//	}

	@AfterMethod(groups = "NotRun")
	public void back() throws InterruptedException {
		driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"))
		.click();
		Thread.sleep(3000);
	}
	@AfterClass
	public void m1()
	{
	 System.out.println("Hi");
	
	}
	@AfterSuite
	public void end()
	{
		driver.close();
	}
	
}
