package actual_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    @Test
    public void test() throws Exception {

        // Setup Firefox Driver automatically
        WebDriverManager.firefoxdriver().setup();
//dgtfjg
        // Headless mode (required for GitHub Actions / CI)
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");

        WebDriver driver = new FirefoxDriver(options);

        // Open application
//        driver.get("https://demo.guru99.com/V4/");
//        driver.get("");
        // -------- VALIDATION 1 (Login Page Loaded) --------
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "Guru99 Bank Home Page", "Login page not loaded");

        // Login
        driver.findElement(By.name("uid")).sendKeys("mngr652986");
        driver.findElement(By.name("password")).sendKeys("jujygEt");
        driver.findElement(By.name("btnLogin")).click();

        Thread.sleep(4000); // simple wait (later we replace with WebDriverWait)

        // -------- VALIDATION 2 (Login Successful) --------
        String homeTitle = driver.getTitle();
        System.out.println("After login title: " + homeTitle);
        Assert.assertTrue(homeTitle.contains("Manager"), "Login failed - Home page not opened");
//erjgerpoigjeporijx
        // Close browser
        driver.quit();
    }
}