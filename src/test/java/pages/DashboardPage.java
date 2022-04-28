package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.Hooksclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardPage {
	WebDriver driver = Hooksclass.driver;
	@FindBy(linkText = "Home")
	WebElement home;
	@FindBy(xpath = "//li[@id='menu-marketing']")
	public static WebElement marketingMenu;
	@FindBy(linkText = "Coupons")
	WebElement clickOnCoupons;

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	public void retail_login_page_should_load() {
		home.isDisplayed();
	}
	@Given("Click on Coupons")
	public void click_on_coupons() {
		marketingMenu.click();
		clickOnCoupons.click();

	}

}
