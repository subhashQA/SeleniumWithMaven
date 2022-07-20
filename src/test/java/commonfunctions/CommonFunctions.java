package commonfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {

	public void hrmLogin()
	{
		System.setProperty("webdriver.chrome.driver", "lib/chrome/chromedriverv103.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
	}
	public void hrmLogOut()
	{
		//logout code
		
	}
	public void takeScreenShot()
	{
		// screen shot code
		
	}
	public void type(WebElement element, String testData)
	{
		element.sendKeys(testData);
	}
}
