package SeleniumTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckLogoOnDashBoard extends BaseClass{
	@Test
	public void checkLogoOnDashBoard() throws Exception{
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		driver.findElement(By.xpath(".//*[@id='pass']")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("cam1");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='loginBtn']")).click();
		boolean result = driver.findElements(By.xpath("html/body/nav[1]/div[1]/a/img")).size()!= 0;
		System.out.println("Logo Present: " + result);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='example-navbar-collapse']/ul[2]/li[4]/a/i")).click();
		driver.findElement(By.xpath(".//*[@id='logOutTxt']")).click();	
		
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		driver.findElement(By.xpath(".//*[@id='pass']")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("public1");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='loginBtn']")).click();
		
		Thread.sleep(3000);
		boolean result1 = driver.findElements(By.xpath("html/body/nav[1]/div[1]/a/img")).size()!= 0;
		System.out.println("Logo Present: " + result1);
		driver.findElement(By.xpath(".//*[@id='example-navbar-collapse']/ul[2]/li[4]/a/i")).click();
		driver.findElement(By.xpath(".//*[@id='logOutTxt']")).click();	

	}
}