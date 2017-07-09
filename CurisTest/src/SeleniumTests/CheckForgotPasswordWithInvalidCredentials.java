package SeleniumTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckForgotPasswordWithInvalidCredentials extends BaseClass{
	@Test
	public void checkForgotPasswordWithInvalidCredentials() throws Exception{
		driver.findElement(By.xpath(".//*[@id='forgetBtn']")).click();
		driver.findElement(By.xpath(".//*[@id='emailInput']")).sendKeys("test@test.com");
		driver.findElement(By.xpath(".//*[@id='verify_btn']")).click();
		Thread.sleep(3000);
		String result= driver.findElement(By.xpath(".//*[contains(@id, 'alert_box')]/p")).getText();
		System.out.println("The alert text for unregistered email for forgot password is: " + result);
		Thread.sleep(3000);
		//driver.get("http://52.163.113.80:8080/Curis/");
	}
}
