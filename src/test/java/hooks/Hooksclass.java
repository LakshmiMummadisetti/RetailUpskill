package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksclass {
	public static WebDriver driver;
	public static String url = "http://retailm1.upskills.in/admin/";
	public static String username = "admin";
	public static String password = "Admin@123";

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void close() {
		driver.quit();
	}

}
