package SeleniumTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAppointment extends BaseClass{
	@Test
	public void CreateAppointmentByCAMUser()throws Exception {

	driver.findElement(By.xpath(".//*[@id='email']")).clear();
	driver.findElement(By.xpath(".//*[@id='pass']")).clear();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("cam1");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
	driver.findElement(By.xpath(".//*[@id='loginBtn']")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	driver.findElement(By.xpath(".//*[@id='makeAppointments']")).click();
	driver.findElement(By.xpath(".//*[@id='personalAppointment']")).click();
	driver.findElement(By.xpath(".//*[@id='selectAppType']")).sendKeys("2");
	driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("automation tests");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='humanBody']/map/area[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='bodyPartContainer']/div[1]")).click();

/*	driver.findElement(By.xpath(".//*[@id='checkBox1']")).click();
	driver.findElement(By.xpath(".//*[@id='checkBox2']")).click();
	driver.findElement(By.xpath(".//*[@id='submit']")).click();
	Thread.sleep(3000);
	String result= driver.findElement(By.xpath(".//*[contains(@id, 'alert_box')]/p")).getText();
	System.out.println("The message is: " + result);
	Thread.sleep(3000);*/
	

  }
}
