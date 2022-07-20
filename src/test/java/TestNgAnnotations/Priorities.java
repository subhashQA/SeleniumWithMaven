package TestNgAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Priorities {
	@Test(priority =1)
	void login()
	{
		System.out.println("Login code");
	}
	
	@Test(priority=0)
	void registerAccount()
	{
		System.out.println("Register account code");
	}
	@Test(priority=2)
	void sendEmail()
	{
		System.out.println("Send email code");
	}
	@Test()
	void HrmLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		SoftAssert softassert=new SoftAssert();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		String expectedResult="Dashboard";
		String actualResult=driver.findElement(By.xpath("")).getText();
		softassert.assertEquals(actualResult, expectedResult);
		
	}
}
