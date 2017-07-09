package SeleniumTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginLogoutByPublicUser extends BaseClass{
	@Test
	public void checkValidLoginLogoutbyPublicUser() throws Exception{
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		driver.findElement(By.xpath(".//*[@id='pass']")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("public1");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='loginBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='example-navbar-collapse']/ul[2]/li[4]/a/i")).click();
		driver.findElement(By.xpath(".//*[@id='logOutTxt']")).click();	
	}
}
