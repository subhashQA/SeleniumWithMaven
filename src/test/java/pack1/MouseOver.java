package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl;
		  //driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		   WebDriver d = new ChromeDriver();
		   d.get("http://www.aptransport.org/");
		//	d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Actions mouse=new Actions(d);
			d.manage().window().maximize();
			//Thread.sleep(1000);
			mouse.moveToElement(d.findElement(By.linkText("REGISTRATION"))).build().perform();
			Thread.sleep(1000);
	}

}
