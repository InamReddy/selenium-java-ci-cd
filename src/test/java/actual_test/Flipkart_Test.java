package actual_test;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_library.WebDriverLibrary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Test {

@Test

	public void test1() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Hp laptops");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
//		WebElement laptopname= driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='nt6sNV JxFEK3 _48O0EI']/div[@class='DOjaWF YJG4Cf']/div[@class='DOjaWF gdgoEp']/div[6]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]"));
		
		
		
		WebElement laptopname=driver.findElement(By.xpath("//div[contains(text() , 'HP Laptop Intel Core i3 12th Gen 1215U')]"));
		// Flag to track if laptop is found
	
		boolean laptopFound = false;  

for(int i=1;i<=24;i++)	
{
	WebElement Overall_laptops=driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[" + i + "]"));
			if(Overall_laptops.equals(laptopname)) {
				System.out.println("Found the laptop: " + laptopname.getText());
		        laptopFound = true;  // Set the flag to true when a match is found
		        laptopname.click();
		        break;  // Exit the loop when the match is found
		        
			}}
			// Print the else statement only if no match was found
			if (!laptopFound) {
			    System.out.println("Sorry, we don't find the HP laptops i5 10 gen laptop");
		}
			Set<String> allWindows= driver.getWindowHandles();
			//System.out.println(allWindows.size());
			ArrayList<String> windowsList=new ArrayList<String>(allWindows);
			
			driver.switchTo().window(windowsList.get(1));
			
			driver.findElement(By.xpath("//button[text()=\"Buy Now\"]")).click();
			
			WebDriverLibrary wlib = new WebDriverLibrary();

			
			wlib.takeScreenshot(driver, "newtes42");
			
			
		Thread.sleep(5000);
		driver.quit();
}}
