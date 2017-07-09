package SeleniumTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginLogoutWithInvalidCredentials extends BaseClass {
	@Test
	public void checkLoginWithInvalidCredentials() throws Exception{
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		driver.findElement(By.xpath(".//*[@id='pass']")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("invalid");
		driver.findElement(By.xpath(".//*[@id='loginBtn']")).click();
		Thread.sleep(3000);
		String result= driver.findElement(By.xpath(".//*[contains(@id, 'alert_box')]/p")).getText();
		System.out.println("The alert text for login with invalid credentials is: " + result);
		driver.findElement(By.xpath(".//*[@id='BlackBoxAction']/button")).click();
		Thread.sleep(3000);
		
	}
}
