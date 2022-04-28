package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooksclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Loginpage {
	WebDriver driver = Hooksclass.driver;
	//String url = Hooksclass.url;
	@FindBy(name = "username") public WebElement username;
	@FindBy(name = "password") public WebElement password;
	@FindBy(xpath = "//button[@type='submit']") WebElement loginButton;
	public Loginpage() {
		PageFactory.initElements(driver, this);
	
	}
	
	public void user_navigated_to_login_page() {
		driver.get(Hooksclass.url);
	    driver.manage().window().maximize();
	    username.sendKeys("admin");
	    password.sendKeys(Hooksclass.password);
	    loginButton.click();
	}
//	@Then("User Enter Login and password And click on Enter")
//	public void user_enter_login_and_password_and_click_on_enter() throws InterruptedException {
		//driver.findElement(By.name("username")).sendKeys("admin");
	  // driver.findElement(By.name("password")).sendKeys("Admin@123");
//	   Thread.sleep(1000);
//	   driver.findElement(By.xpath("//button[@type='submit']")).click();



}
