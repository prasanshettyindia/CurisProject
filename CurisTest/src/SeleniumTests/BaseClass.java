package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass{
WebDriver driver;
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
	
	@BeforeClass
	public void SetUp(){
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://52.163.113.80:8080/Curis/");
	}
}
