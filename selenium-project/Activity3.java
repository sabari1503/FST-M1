import java.net.http.HttpClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity3 {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void fnSetup() {
		//Initialize the firefox webdriver
		driver = new FirefoxDriver();
				
		//Navigate to the web page
		driver.get("https://alchemy.hguy.co/jobs/");
	}
	@Test
	public void fnActivity3() {
		
		WebElement elementImg = driver.findElement(By.tagName("img"));
		String imageUrl = elementImg.getAttribute("src");
		System.out.println("The Image URL is: "+imageUrl);
		
	}
	@AfterMethod
	public void fnTearDown() {
		driver.quit();
	}
	
}
