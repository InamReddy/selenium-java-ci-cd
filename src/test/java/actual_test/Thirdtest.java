package actual_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Thirdtest {

    @Test
    public void test2() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");     // VERY IMPORTANT
        options.addArguments("--no-sandbox");       // Required in Linux CI
        options.addArguments("--disable-dev-shm-usage"); // Prevent crash

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.flipkart.com/");

        driver.findElement(By.name("q")).sendKeys("Hp laptops");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.quit();
    }
}