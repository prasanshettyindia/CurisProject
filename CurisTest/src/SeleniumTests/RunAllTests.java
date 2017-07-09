package SeleniumTests;


import org.openqa.selenium.By;

//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class RunAllTests extends BaseClass {

	
	@Test
	public void checkLogo(){
		boolean result = driver.findElements(By.xpath("html/body/nav[1]/div[1]/a/img")).size()!= 0;
		System.out.println("Logo Present: " + result);
	}
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
	@Test
	public void checkValidLoginLogoutbyCAMUser() throws Exception{
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		driver.findElement(By.xpath(".//*[@id='pass']")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("cam1");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='loginBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='example-navbar-collapse']/ul[2]/li[4]/a/i")).click();
		driver.findElement(By.xpath(".//*[@id='logOutTxt']")).click();	
	}
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
	@Test
	public void checkForgotPasswordWithInvalidCredentials() throws Exception{
		driver.findElement(By.xpath(".//*[@id='forgetBtn']")).click();
		driver.findElement(By.xpath(".//*[@id='emailInput']")).sendKeys("test@test.com");
		driver.findElement(By.xpath(".//*[@id='verify_btn']")).click();
		Thread.sleep(3000);
		String result= driver.findElement(By.xpath(".//*[contains(@id, 'alert_box')]/p")).getText();
		System.out.println("The alert text for unregistered email for forgot password is: " + result);
		Thread.sleep(3000);
		driver.get("http://52.163.121.157:8080/Curis/");
	}
	
	
	

	
	

}
/*public class FirstPageValidation{
	
	public WebDriver driver;
	
	@BeforeSuite
	public void initializeBrowser(){
		driver = new ChromeDriver();
	}
	@BeforeTest
	public void invokeURL(){
		driver.get("http://52.163.121.157:8080/Curis/");
	}
	@Test
	public void FirstTest(){
		driver.findElement(By.id("firstName")).sendKeys("abctest");
	}
}*/