package actual_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sixith {

@Test
public void test28() throws Throwable {
	
	WebDriverManager.chromedriver().setup();
	
	 WebDriver  ganesh =new ChromeDriver();
	 
         ganesh.get("https://www.youtube.com/");

         ganesh.manage().window().maximize();
         
     WebElement   serach_for_song= ganesh.findElement(By.name("search_query"));
         
     serach_for_song.sendKeys("mamidi konalameeda folk song");
     
     ganesh.findElement(By.xpath(" //button[@title='Search']//div")).click();
     
     Thread.sleep(5000);
     
    /* 
//     WebElement click_on_songs=ganesh.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string"));
//     
//     click_on_songs.click();
     
     */
   WebElement click_on_song=  ganesh.findElement(By.xpath("//yt-formatted-string[@aria-label='MAMIDI KONALA MEENA | MADHU PRIYA | NAGADURGA | KAMAL ESLAVATH | NAGAVVA | SHEKAR VIRUS |KALYAN KEYS 1 minute, 25 seconds']"));
             
   click_on_song.click();
         
   
   Thread.sleep(9000);
	 
	 ganesh.quit();
	
}

}
