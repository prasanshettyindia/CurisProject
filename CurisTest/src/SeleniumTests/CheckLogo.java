package SeleniumTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckLogo extends BaseClass{
	@Test
	public void checkLogo(){
		boolean result = driver.findElements(By.xpath("html/body/nav[1]/div[1]/a/img")).size()!= 0;
		System.out.println("Logo Present: " + result);
	}
}
