package pack1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("D:\\Training\\Selenium\\seleniumexamples//WebTable.html");
		String before_xpath = "//table/tbody/tr["; 
		String after_xpath = "]/td[2]";
		List rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowSize = rows.size();
		System.out.println("RowSize " +rowSize);
		for (int i = 2; i <= rowSize; i++) {
		String firstNames = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		System.out.println("First Name " +firstNames);
		// Now click the checkBox where first Name would be Ashok
		if (firstNames.contains("Ashok")) {
		// click the checkBox
		driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/input")).click(); 
		System.out.println("candidate has been selected");
		break;
		}
		}
		//driver.close();

	}

}
