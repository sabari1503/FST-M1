import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	
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
	public void fnActivity5() {
		driver.findElement(By.linkText("Jobs")).click();
		
		//Page title after the click
		String strPageTitle = driver.getTitle();
		
		//Print the page title
		System.out.println("The Page title is: "+strPageTitle);
		
		assertEquals(strPageTitle, title);
		
	}
	@AfterMethod
	public void fnTearDown() {
		driver.quit();
	}

}
