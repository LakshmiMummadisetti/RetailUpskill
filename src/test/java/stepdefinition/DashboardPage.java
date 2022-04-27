package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.Hooksclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardPage {
	WebDriver driver = Hooksclass.driver;
	@Then("Retail Login Page should load")
	public void retail_login_page_should_load() {
	   driver.findElement(By.linkText("Home")).isDisplayed();
	  
	}
	@Given("Click on Coupons")
	public void click_on_coupons() {
	    driver.findElement(By.xpath("//li[@id='menu-marketing']")).click();
	    driver.findElement(By.linkText("Coupons")).click();
	    
	}
}
