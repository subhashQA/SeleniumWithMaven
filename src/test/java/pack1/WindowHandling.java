package pack1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://secure.indeed.com/account/login";
	      driver.get(url);
	      //implicit wait
	   //   driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      // store all window handles
	      Set<String> a = driver.getWindowHandles();
	      // iterate through handles
	      Iterator<String> it = a.iterator();
	      String chlwnd = it.next();
	      String pwnd = it.next();
	      // switch to child window
	      driver.switchTo().window(chlwnd);
	      System.out.println("Page title "+ driver.getTitle());
	      // switch to parent window
	      driver.switchTo().window(pwnd);
	      System.out.println("Page title "+ driver.getTitle());

	}

}
