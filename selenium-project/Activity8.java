import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	
	private WebDriver driver;
	private String title = "Jobs – Alchemy Jobs";
	private String expHead = "Dashboard";
	
	@BeforeMethod
	public void fnSetup() {
	
		//Initialize the firefox webdriver
		driver = new FirefoxDriver();
		
		//Navigate to the web page
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		
	}
	@Test
	public void fnActivity8() throws InterruptedException {
		
		//find the username input field
		driver.findElement(By.xpath("//input[@id = 'user_login']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@id = 'user_pass']")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.xpath("//input[@id = 'wp-submit']")).click();
		
		String heading = driver.findElement(By.tagName("h1")).getText();
		System.out.println("The heading of the page is: "+heading);
		
		assertEquals(heading, expHead);
		
		System.out.println("The user is successfully logged in");
		
		driver.findElement(By.id("menu-posts-job_listing")).click();
		
		driver.findElement(By.linkText("Add New")).click();
		
		driver.findElement(By.id("post-title-0")).sendKeys("Full Stack Tester");
		
		driver.findElement(By.id("_job_location")).sendKeys("Bengaluru");
		
		driver.findElement(By.id("_company_name")).sendKeys("IBM India Pvt Ltd");
		
		driver.findElement(By.id("_company_website")).sendKeys("www.ibm.com");
		
		driver.findElement(By.id("_company_tagline")).sendKeys("THINK");
		
		driver.findElement(By.id("_company_twitter")).sendKeys("@IBM");
		
		driver.findElement(By.id("_featured")).click();
		
		driver.findElement(By.id("_company_video")).sendKeys("https://www.youtube.com");
		
		driver.findElement(By.id("_job_expires")).sendKeys("May 15, 2021");
		
		driver.findElement(By.className("components-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@title='Publish']")).click();
		
	}
	@AfterMethod
	public void fnTearDown() {
		driver.quit();
	}

}
