package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import commonfunctions.CommonFunctions;
public class HrmSearchEmployee {
	WebDriver driver;
	CommonFunctions obj=new CommonFunctions();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HrmSearchEmployee search= new HrmSearchEmployee();
		search.searchEmployee("Odis");
		//search.searchEmployee("Odis","Smith");
			}
	@SuppressWarnings("deprecation")
	void searchEmployee(String empName) throws InterruptedException
	{
		SoftAssert softAssert = new SoftAssert();
		obj.hrmLogin();
		Thread.sleep(1000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Odis");
		driver.findElement(By.id("searchBtn")).click();
		String actualResult=driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
		String expectedResult="Odis";
		//Assert.assertEquals(expectedResult, actualResult);
		softAssert.assertEquals(expectedResult, actualResult);
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("David Kennedy John");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]")).click();
		//driver.close();

	}
	void searchEmployee(String empName,String supervisorName)
	{
		//code
	}
	void searchEmployee(String employmentStatus, String incluce,String jobTitle,String subUnit)
	{
		//code
	}
}
