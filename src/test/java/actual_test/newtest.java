package actual_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_library.WebDriverLibrary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Newtest {

	@Test 
	public void test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Hp laptops");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
}
