package actual_test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxOptions;
public class test14 {




	@Test
	public void test() throws Throwable {

	    WebDriverManager.firefoxdriver().setup();

	    FirefoxOptions options = new FirefoxOptions();
	    options.addArguments("--headless");   // runs in CI server

	    WebDriver driver = new FirefoxDriver(options);

	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/V4/");

	    driver.findElement(By.name("uid")).sendKeys("mngr652986");
	    driver.findElement(By.name("password")).sendKeys("jujygEt");
	    driver.findElement(By.name("btnLogin")).click();

	    Thread.sleep(4000);

	    driver.quit();
	}
}
