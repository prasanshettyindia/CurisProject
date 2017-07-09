package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateMyHealthRecord {
	public class LoginLogoutByClinicianUser extends BaseClass {
		@Test
		public void checkValidLoginLogoutbyCAMUser() throws Exception{
			driver.findElement(By.xpath(".//*[@id='email']")).clear();
			driver.findElement(By.xpath(".//*[@id='pass']")).clear();
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("prasanshetty@yahoo.com");
			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Test1234");
			driver.findElement(By.xpath(".//*[@id='loginBtn']")).click();
			Thread.sleep(3000);
			driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
			driver.findElement(By.xpath(".//*[@id='myHealthRecord']")).click();
			//Thread.sleep(3000);
			new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.id("BBOverlay")));
			driver.findElement(By.id("addLog")).click();
			//driver.findElement(By.cssSelector(".row .form-group .col-md-4 .btn-group #addLog")).click();

			//driver.findElement(By.cssSelector(".btn-group #addLog")).click();
			//driver.findElement(By.xpath("//button[@id='addLog'][@class='btn btn-awh1']")).click();
			//driver.findElement(By.xpath("//button[@id='addLog']")).click();
			//driver.findElement(By.xpath("//button[contains(text(),'Create My Health Log')]")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath(".//*[@id='desc']")).sendKeys("test health record");
			//driver.findElement(By.xpath(".//*[@id='createLogForm']/div[4]/button[1]")).click();

           }
    }
}