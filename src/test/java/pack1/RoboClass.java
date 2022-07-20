package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RoboClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://adactinhotelapp.com");
		driver.findElement(By.name("username")).sendKeys("shubham1911");
		Thread.sleep(500);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(500);
		driver.findElement(By.name("login")).click();
		Thread.sleep(500);
		
		//Right Click :
		WebElement A1=driver.findElement(By.id("location"));
		Actions action=new Actions(driver);
		action.contextClick(A1).perform();
		
		//Inspect :
                Robot robot = new Robot();	
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(1000);

                WebElement a2=driver.findElement(By.name("location"));
		Select A2=new Select(a2);
		A2.selectByValue("Paris");
		Thread.sleep(500);
		
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(500);

		driver.findElement(By.id("radiobutton_2")).click();
		Thread.sleep(500);

		driver.findElement(By.name("continue")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("first_name")).sendKeys("Mr_Shubham");
		Thread.sleep(500);
		
		//Double click :
		WebElement A3=driver.findElement(By.id("first_name"));
		Actions action1=new Actions(driver);
		action1.doubleClick(A3).perform();
		
		//Right click :
		WebElement A4=driver.findElement(By.id("first_name"));
		Actions action2=new Actions(driver);
		action2.contextClick(A3).perform();
                Thread.sleep(1000);

        //Copy :
        Robot robot2= new Robot();	
        robot2.keyPress(KeyEvent.VK_ENTER);
        robot2.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot2.keyPress(KeyEvent.VK_DOWN);
        robot2.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot2.keyPress(KeyEvent.VK_DOWN);
        robot2.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot2.keyPress(KeyEvent.VK_DOWN);
        robot2.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot2.keyPress(KeyEvent.VK_DOWN);
        robot2.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        robot2.keyPress(KeyEvent.VK_ENTER);
        robot2.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        driver.findElement(By.id("last_name")).click();
        Thread.sleep(500);

            //Right click :
            WebElement A6=driver.findElement(By.id("last_name"));
            Actions action4=new Actions(driver);
            action4.contextClick(A6).perform();
            Thread.sleep(1000);

            //Paste :
	    Robot robot3= new Robot();	
	    robot3.keyPress(KeyEvent.VK_ENTER);
	    robot3.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    robot3.keyPress(KeyEvent.VK_DOWN);
	    robot3.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    robot3.keyPress(KeyEvent.VK_DOWN);
	    robot3.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(1000);
	    robot3.keyPress(KeyEvent.VK_ENTER);
	    robot3.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);


	}

}
