package TestNg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Singup {
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
	public void singuppage() throws AWTException
	{
		
		driver.switchTo().frame(driver.findElement(By.id("frame-one1434677811")));
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("nagababu");
		
		
		 driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("maddi");
		 driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("9059506469");
		  driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");
		 driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("hyderabad");
		 driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("mdd@gmail.com");
		 
		 //driver.switchTo().defaultContent();
		 
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 driver.findElement(By.xpath("//label[text()='Tuesday']")).click();
		 
		 //select drop down
		WebElement ele= driver.findElement(By.xpath("//select[@name='RESULT_RadioButton-9']"));
		Select sle=new Select(ele);
		sle.selectByVisibleText("Evening");
		
		//upload file
		
		driver.findElement(By.cssSelector("div.inline_answer")).click();
		 
	
		 StringSelection str=new StringSelection("C:\\Users\\Naga Babu\\Downloads\\Passport Size.jpeg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		 
		 Robot rb=new Robot();
		 rb.delay(2000);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			
			//Enter
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
	}
	
	
	@AfterMethod
	public void teardown() 
	{
		driver.close();
		
	}
	
}
