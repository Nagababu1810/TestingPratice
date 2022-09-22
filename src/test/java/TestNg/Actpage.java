package TestNg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actpage {

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
	public void act()
	{
		//doubleclick
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.moveToElement(element).doubleClick().build().perform();
		
		//dranga and drop
		WebElement elemetnsource=driver.findElement(By.id("draggable"));
		WebElement elementtarget=driver.findElement(By.id("droppable"));
		act.dragAndDrop(elemetnsource, elementtarget).build().perform();
		
		
		//drag and drop images
		WebElement img1=driver.findElement(By.xpath("//img[@alt='the peaks of high tatras']"));
		WebElement img2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		
		act.dragAndDrop(img1, target).build().perform();
		act.dragAndDrop(img2, target).build().perform();
		
		
		//slider bar
		//WebElement slider=driver.findElement(By.id("slider"));
		//act.clickAndHold(slider).build().perform();
		//act.dragAndDropBy(slider, 50, 150).build().perform();
		
		
		//resize
		//WebElement resize=driver.findElement(By.id("resizable"));
		//act.dragAndDropBy(resize, 0, 50).build().perform();
		
	}
	
	
	@AfterMethod
	public void teardown() 
	{
		driver.close();
		
	}
	
	
	
}
