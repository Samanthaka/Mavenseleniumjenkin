package MavenSeleniumJenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001
{
	@Test
	public void login() {
		System.setProperty("webdriver, chrome.driver","./Drivername/Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.Facebook.com");
		System.out.println("Successfully ran 1");
		driver.quit();
		
	}
	
}
