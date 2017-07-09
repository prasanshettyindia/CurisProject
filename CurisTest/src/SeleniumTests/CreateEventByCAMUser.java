package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class CreateEventByCAMUser extends BaseClass{
	@Test
	public void CreateEventByCAMUserPositive()throws Exception {

	driver.findElement(By.xpath(".//*[@id='email']")).clear();
	driver.findElement(By.xpath(".//*[@id='pass']")).clear();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("cam1");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("admin123");
	driver.findElement(By.xpath(".//*[@id='loginBtn']")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	driver.findElement(By.xpath(".//*[@id='manageEvents']")).click();
	
	Thread.sleep(3000);
	//driver.switchTo().frame(2);
	driver.findElement(By.xpath("//*[contains(@href, '#proposed')]")).click();
	//driver.findElement(By.xpath("//li[@role='presentation']/a[@role='tab']")).click();
	//Actions action = new Actions(driver);
	//action.moveToElement(driver.findElement(By.xpath("//li/a[text()='My Proposed Events']"))).doubleClick().perform();

	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='addNewEvent']")).click();
	driver.findElement(By.xpath(".//*[@id='titleInput']")).sendKeys("Test Create Event");
	driver.findElement(By.xpath(".//*[@id='richText']")).sendKeys("Test Create Events description");
	driver.findElement(By.xpath(".//*[@id='startTime']")).sendKeys("2017-03-14");
	driver.findElement(By.xpath(".//*[@id='duration']")).sendKeys("2");
	driver.findElement(By.xpath(".//*[@id='location']")).sendKeys("Test location");
	driver.findElement(By.xpath(".//*[@id='eventType']")).sendKeys("Test Event");
	driver.findElement(By.xpath(".//*[@id='tag']")).click();
	driver.findElement(By.xpath(".//*[@id='6']")).click();
	driver.findElement(By.xpath(".//*[@id='5']")).click();
	driver.findElement(By.xpath(".//*[@id='saveTag']")).click();
	driver.findElement(By.xpath(".//*[@id='submit']")).click();
	
	}
}
