package actual_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/V4/");
    }

    @Test
    public void verifyLogin() {

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        Assert.assertEquals(title, "Guru99 Bank Home Page");

        driver.findElement(By.name("uid")).sendKeys("mngr652986");
        driver.findElement(By.name("password")).sendKeys("jujygEt");
        driver.findElement(By.name("btnLogin")).click();

        String afterLoginTitle = driver.getTitle();
        System.out.println("After login title: " + afterLoginTitle);

        // ❌ INTENTIONALLY WRONG EXPECTED TITLE (this will FAIL)
        Assert.assertEquals(afterLoginTitle, "Manager HomePage WRONG TITLE");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}