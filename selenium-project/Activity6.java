import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
	
	private WebDriver driver;
	private String title = "Jobs – Alchemy Jobs";
	
	@BeforeMethod
	public void fnSetup() {
	
		//Initialize the firefox webdriver
		driver = new FirefoxDriver();
		
		//Navigate to the web page
		driver.get("https://alchemy.hguy.co/jobs");
		
	}
	@Test
	public void fnActivity6() throws InterruptedException {
		driver.findElement(By.linkText("Jobs")).click();
		
		//Page title after the click
		String strPageTitle = driver.getTitle();
		
		//Print the page title
		System.out.println("The Page title is: "+strPageTitle);
		
		//Assertion on the page title
		assertEquals(strPageTitle, title);
		
		//Pass the input value
		driver.findElement(By.id("search_keywords")).sendKeys("TeleCaller");
		
		//click on Search job button
		driver.findElement(By.className("search_submit")).click();
		
		Thread.sleep(5000);
							
		//find the tellecaller job
			driver.findElement(By.xpath("//ul[@class = 'job_listings']/li/a")).click();
			driver.findElement(By.className("application_button")).click();
			String email = driver.findElement(By.className("job_application_email")).getText();
			System.out.println("The email present in the job is: "+email);
		
	}
	@AfterMethod
	public void fnTearDown() {
		driver.quit();
	}

}
