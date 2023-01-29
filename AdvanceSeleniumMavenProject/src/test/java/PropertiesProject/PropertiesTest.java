package PropertiesProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PropertiesTest {

	WebDriver driver;
	static Properties pro;

	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Alljar\\\\Chrome Driver\\\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@BeforeTest
	public void window() throws IOException {
		driver.manage().window().maximize();
		pro = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selinium\\Data\\Login.txt");
		pro.load(fis);
	}

	@BeforeClass
	public void openWebPage() {
		String url = pro.getProperty("loginUrl");
		driver.get(url);
	}
	@Test
	public void login() {
		String un = pro.getProperty("username");
		driver.findElement(By.name("userName")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pro.getProperty("pass"));
		driver.findElement(By.name("submit")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	

}
