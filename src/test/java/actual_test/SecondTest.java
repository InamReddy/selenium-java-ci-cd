package actual_test;   // ⚠ change if your package is actual_test

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {

    @Test
    public void verifyHeadingShouldFail() {

        // Setup driver
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless"); // Required for GitHub CI

        WebDriver driver = new FirefoxDriver(options);

        // Open site
        driver.get("https://demo.guru99.com/V4/");

        // Get actual heading
        String actualHeading = driver.findElement(By.xpath("//h2")).getText();
        System.out.println("Actual heading: " + actualHeading);

        // Intentionally wrong expected text
        String expectedHeading = "THIS TEST MUST FAIL";

        // This assertion will FAIL
        Assert.assertEquals(actualHeading, expectedHeading, "Heading does not match");

        driver.quit();
    }
}