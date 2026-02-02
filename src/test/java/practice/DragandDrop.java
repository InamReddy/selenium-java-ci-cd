package practice;

import java.io.File;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {


	
	@Test
	public void Draganddrop1() throws Throwable {
		// Open the Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver 	=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop Action']")).click();
		
	WebElement	src1=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		
	WebElement	dest1=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
Actions	ac=new Actions(driver);
		
ac.dragAndDrop(src1, dest1).perform();
Thread.sleep(5000);

//TakesScreenshot    ts=(TakesScreenshot)driver;
//File src=ts.getScreenshotAs(OutputType.FILE);
//    
//File dest = new File("C:\\Users\\HP\\Pictures\\Screenshots\\newphoto.png");
//	
//	Files.copy(src, dest);
	
  
 TakesScreenshot	ts=(TakesScreenshot)driver;
 File src=ts.getScreenshotAs(OutputType.FILE);

 File dest=new File("C:\\Users\\HP\\Pictures\\Screenshots\\newphoto1.png");
 
 Files.copy(src, dest);
 	
 	
	}
	
}
