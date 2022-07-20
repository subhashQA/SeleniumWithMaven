package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib/chrome/chromedriverv103.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		/*driver.navigate().back();// clicks on back button of the browser
		driver.navigate().forward();// clicks on forward button of the browser
		driver.navigate().refresh();// clicks on refresh button on the browser*/
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).clear();
		//driver.findElement(By.cssSelector("css=#txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.get("https://www.eenadu.net/");
		driver.quit();
		
}

}
