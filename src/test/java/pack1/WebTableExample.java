package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "lib/chrome/chromedriverv103.exe");
		  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp"); 
		//Get number of rows In table.
		int Row_count = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
		System.out.println("Number Of Rows = " +Row_count);
		//Get number of columns In table. 
		int Col_count = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th")).size();
		System.out.println("Number Of Columns = "+Col_count);
		//divided xpath In three parts to pass Row_count and Col_count values. 
		/*String first_part ="//*[@id='customers']/tbody/tr[";// "//*[@id='customers']/tbody/tr["; 
		String second_part =  "]/td[";//"]/td["; 
		String third_part = "]";*/
		//Used for loop for number of rows. 
		for (int i=1; i<=Row_count; i++)
			{
				
				//Used for loop for number of columns.
				for(int j=1; j<=Col_count; j++)
				{ 
					//Prepared final xpath of specific cell as per values of i and j.
					String first_part ="//*[@id='customers']/tbody/tr[i";// "//*[@id='customers']/tbody/tr["; 
					String second_part =  "]/td[j";//"]/td["; 
					String third_part = "]";
					String final_xpath = first_part+second_part+third_part;
					System.out.println("Inside J loop");
					//Will retrieve value from located cell and print It. 
					String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
					System.out.print(Table_data +" ");
					}
				System.out.println(""); 
				System.out.println(""); 
				}
	}

}
