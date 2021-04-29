import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	
	private WebDriver driver;
	private String expHeading = "Welcome to Alchemy Jobs";
	
	@BeforeMethod
	public void fnSetup() {
	
		//Initialize the firefox webdriver
		driver = new FirefoxDriver();
		
		//Navigate to the web page
		driver.get("https://alchemy.hguy.co/jobs/");
		
	}
	@Test
	public void fnActivity2() {
		String pageHeading = driver.findElement(By.tagName("h1")).getText();
		//String pageHeading = driver.findElement(By.className("entry-title")).getText();
		System.out.println("The page heading is: "+pageHeading);
		assertEquals(pageHeading, expHeading);
		
	}
	@AfterMethod
	public void fnTearDown() {
		driver.quit();
	}

}
