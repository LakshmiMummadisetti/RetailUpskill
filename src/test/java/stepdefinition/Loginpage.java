package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.Hooksclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Loginpage {
	WebDriver driver = Hooksclass.driver;
	@Given("User Navigated to Login Page")
	public void user_navigated_to_login_page() {
		driver.get("http://retailm1.upskills.in/admin/");
	    driver.manage().window().maximize();
	}
	@Then("User Enter Login and password And click on Enter")
	public void user_enter_login_and_password_and_click_on_enter() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("password")).sendKeys("Admin@123");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

	
	


}
