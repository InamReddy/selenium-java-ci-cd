package actual_test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdClass {

	
	@Test
	public void test2() {
		
	
	  // Setup driver
    WebDriverManager.chromedriver().setup();
     	
	}
}
