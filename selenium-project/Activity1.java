import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
	
	private WebDriver driver;
	private String expTitle = "Alchemy Jobs – Job Board Application";
	
	@BeforeTest
	public void fnSetup() {
		//initialize the firefox webdriver
		driver = new FirefoxDriver();
	}
	
	
	@Test
	public void fnActivity1() {
		//Navigate to the url
		driver.get("https://alchemy.hguy.co/jobs");
		
		//find the title of the page
		String strPageTitle = driver.getTitle();
		System.out.println("The title of the page is: "+strPageTitle);

		//If the expected result is true then the assertion will be passed
		assertEquals(strPageTitle, expTitle);	
	}
	
	@AfterTest
	public void fnTearDown() {
		driver.close();
	}
	

}
