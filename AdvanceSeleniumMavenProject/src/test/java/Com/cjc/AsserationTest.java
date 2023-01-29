package Com.cjc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserationTest {

	WebDriver driver;

	@Test
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Alljar\\\\Chrome Driver\\\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/login");

		String url = driver.getCurrentUrl();

//		Assert.assertEquals(url, "https://demowebshop.com/login");
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input"))
	//	.click();
	}

	@Test
	public void openUrl1() {
		String url = driver.getCurrentUrl();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(url, "https://demowebshop.com/login");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input"))
				.click();

		sa.assertAll();
	}
}
