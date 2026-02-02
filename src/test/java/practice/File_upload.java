package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload {

	
	WebDriver driver=null;
	
	@Test
	public void First_program() throws Throwable {
		// Open the Browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver 	=new ChromeDriver();
				driver.get("https://demo.guru99.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
			
				
				driver.findElement(By.xpath("//a[normalize-space()='File Upload']")).click();
				
				
				WebElement uploadElement = driver.findElement(By.name("uploadfile_0"));

		        // Provide the absolute file path to the file input element
		        String filePath = "C:\\Users\\HP\\Downloads\\OOPS.txt";
		        uploadElement.sendKeys(filePath);

		        //clicking the Check box
		        
		        driver.findElement(By.id("terms")).click();
		        Thread.sleep(4000);
		        
		        // submit button to click after file upload:
		        WebElement submitButton = driver.findElement(By.name("send"));
		        submitButton.click();

		   

				
	}
		
	
}
