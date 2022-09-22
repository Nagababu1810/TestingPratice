package TestNg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newwindow {

	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumResources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		
	}
	@Test
	public void newpart()
	{
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("happy");
		driver.findElement(By.cssSelector(".wikipedia-search-button")).click();
	
		//alert
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		Alert al=driver.switchTo().alert();
		
		//al.accept();
		al.dismiss();
		
		
		//date picker
		
		driver.findElement(By.id("datepicker")).click();
		
		//driver.findElement(By.className("ui-state-default")).()
		
		driver.findElement(By.xpath("//a[text()='30']")).click();
	}
	
	@AfterMethod
	public void teardown() 
	{
		driver.close();
		
	}
	
	
	
	
}
