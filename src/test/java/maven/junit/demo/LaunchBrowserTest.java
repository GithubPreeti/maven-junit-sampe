package maven.junit.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserTest {

	public WebDriver driver;
	@Test
	public void launchBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
        assertEquals("Google", driver.getTitle());
		driver.close();
		driver.quit();
	}
	
	
	

	
}
