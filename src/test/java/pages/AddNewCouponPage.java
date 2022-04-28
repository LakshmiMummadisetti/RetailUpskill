package pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hooks.Hooksclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewCouponPage {
	WebDriver driver = Hooksclass.driver;
	public static String CouponName = "Lakshmi Coupon";
	public static String EditedCouponName = "KumariM";
	int min = 501444;
	int max = 11400000;
	int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
	@FindBy(id = "input-name")
	WebElement enterCouponName;
	@FindBy(name = "code")
	WebElement enterCode;
	@FindBy(name = "type")
	WebElement type;
	@FindBy(name = "discount")
	WebElement discount;
	@FindBy(name = "total")
	WebElement total;
	@FindBy(xpath = "//input[@name='logged' and @value='1']")
	WebElement customer_login_radio;
	@FindBy(xpath = "//input[@name='shipping' and @value='1']")
	WebElement freeshipping_radio;
	@FindBy(name = "product")
	WebElement productdetails;
	@FindBy(name = "category")
	WebElement category;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	WebElement startcalendar;
	@FindBy(xpath = "//td[@class='day active today']")
	WebElement startdate;
	@FindBy(xpath = "(//button[@class='btn btn-default'])[2]")
	WebElement endcalendar;
	@FindBy(xpath = "//td[@class='day active']")
	WebElement enddate;
	@FindBy(name = "uses_total")
	WebElement entertotal;
	@FindBy(name = "uses_customer")
	WebElement user_per_customer;
	@FindBy(name = "status")
	WebElement selectStatus;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public AddNewCouponPage() {
		PageFactory.initElements(driver, this);
	}

	public void enter_all_the_necessary_details_and_save() {

		// Enter Company Name
		enterCouponName.sendKeys(CouponName);
		// Enter code
		enterCode.sendKeys(String.valueOf(random_int));
		// Enter Type
		type.sendKeys("100");
		// Enter Discount
		discount.sendKeys("10");
		// Enter Total amount
		total.sendKeys("10000");
		// Select customer login radio button
		customer_login_radio.click();
		// select radio button for free shipping
		freeshipping_radio.click();
		// Enter the Products details
		productdetails.sendKeys("This is for testing purpose");
		// Enter the Category
		category.sendKeys("Watches");
		// Select Start date
		startcalendar.click();
		startdate.click();
		// Select End date
		endcalendar.click();
		enddate.click();
		// uses per coupon
		entertotal.sendKeys("This is for testing purpose");
		// uses per customer
		user_per_customer.sendKeys("This is for testing purpose");
		// select status
		Select status = new Select(selectStatus);
		status.selectByVisibleText("Enabled");
		// Select save button
		submit.click();
	}
	public void edit_coupon_page_loaded_update_the_coupon_name() {
		// Edit the Coupon Name
		enterCouponName.clear();
		enterCouponName.sendKeys(EditedCouponName);
		// Select save button
		submit.click();
	}

}
