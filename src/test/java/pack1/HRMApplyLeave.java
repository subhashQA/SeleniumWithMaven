package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HRMApplyLeave {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Assign Leave")).click();
		driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Paul Collings");
		WebElement leaveType=driver.findElement(By.name("assignleave[txtLeaveType]"));
	    Select leave=new Select(leaveType);
	    leave.selectByIndex(2);
	    driver.findElement(By.id("assignleave_txtFromDate")).clear();
	    driver.findElement(By.id("assignleave_txtFromDate")).sendKeys("2022-04-20");
	    driver.findElement(By.id("assignleave_txtToDate")).clear();
	    driver.findElement(By.id("assignleave_txtToDate")).sendKeys("2022-04-20");
	    Robot obj=new Robot();
	    obj.keyPress(KeyEvent.VK_TAB);
	    obj.keyRelease(KeyEvent.VK_TAB);

	    driver.findElement(By.id("assignBtn")).click();
	    
	    
		

	}

void applyLeave()
{
	
}
	
	
	
	
	
	
	void hrmLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}
	
	
	
	
	
	
	
}
