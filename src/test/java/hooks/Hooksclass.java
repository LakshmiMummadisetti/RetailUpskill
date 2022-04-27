package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksclass {
	public static WebDriver driver;
	
	@Before
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@After
	public void close()
	{
		driver.quit();
	}

}
