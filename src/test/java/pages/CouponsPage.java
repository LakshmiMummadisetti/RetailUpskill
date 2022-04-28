package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import hooks.Hooksclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CouponsPage {
	WebDriver driver = Hooksclass.driver;

	@FindBy(xpath = "//a[@data-original-title='Add New']")
	WebElement click_add_coupon;
	@FindBy(xpath = "//td[contains(text(),'Lakshmi Coupon')]")
	WebElement verifyTheAddedcoupon;
	@FindBy(xpath = "//div/table/tbody/tr//td[contains(text(),'Lakshmi Coupon')]//following-sibling::td[6]/a/i")
	WebElement editcouponbutton;
	@FindBy(xpath = "//td[contains(text(),'KumariM')]")
	WebElement editedCouponName;
	@FindBy(xpath = "//td[contains(text(),'KumariM')]//parent::tr//input")
	WebElement checkbox;
	@FindBy(xpath = "//button[@data-original-title='Delete']")
	WebElement delete;

	public CouponsPage() {
		PageFactory.initElements(driver, this);
	}
	public void click_on_add_coupon() {
		click_add_coupon.click();
	}
	public void verify_the_added_coupon() {
		WebElement ActualCouponName = verifyTheAddedcoupon;
		Assert.assertEquals(AddNewCouponPage.CouponName, ActualCouponName.getText());
	}
	public void edit_the_added_coupon() {
		editcouponbutton.click();
	}
	public void verify_the_edited_coupon_in_coupon_list() {
		WebElement ActualEditCouponName = editedCouponName;
		Assert.assertEquals(AddNewCouponPage.EditedCouponName, ActualEditCouponName.getText());
	}
	public void delete_the_coupon() {
		checkbox.click();
		delete.click();
		driver.switchTo().alert().accept();
	}
}
