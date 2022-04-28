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
}
