package maven.junit.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LaunchBrowserTest {

	public WebDriver driver;
	@Test
	public void launchBrowser() {
		ChromeOptions ChromeOptions = new ChromeOptions();
ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		driver = new ChromeDriver(ChromeOptions);
		driver.get("https://www.google.com/");
        assertEquals("Google", driver.getTitle());
		driver.close();
		driver.quit();
	}
	
	
	

	
}
