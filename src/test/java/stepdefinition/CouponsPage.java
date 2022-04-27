package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import hooks.Hooksclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CouponsPage {
	WebDriver driver = Hooksclass.driver;
	@Then("Click on Add Coupon")
	public void click_on_add_coupon() {
	   driver.findElement(By.xpath("//a[@data-original-title='Add New']")).click();
	}
	
	@Then("Verify the added Coupon")
	public void verify_the_added_coupon() {
		WebElement ActualCouponName = driver.findElement(By.xpath("//td[contains(text(),'Lakshmi Coupon')]"));
	   Assert.assertEquals(AddNewCouponPage.CouponName, ActualCouponName.getText());
	}
	@Then("Click Edit the added Coupon")
	public void edit_the_added_coupon() {
		
		driver.findElement(By.xpath("//div/table/tbody/tr//td[contains(text(),'Lakshmi Coupon')]//following-sibling::td[6]/a/i")).click();
	   
	}
	@When("Verify the Edited coupon in coupon list")
	public void verify_the_edited_coupon_in_coupon_list() {
		WebElement ActualEditCouponName = driver.findElement(By.xpath("//td[contains(text(),'KumariM')]"));
		   Assert.assertEquals(AddNewCouponPage.EditedCouponName, ActualEditCouponName.getText());
	}
	@When("Delete the coupon")
	public void delete_the_coupon() {
	    driver.findElement(By.xpath("//td[contains(text(),'KumariM')]//parent::tr//input")).click();
	    driver.findElement(By.xpath("//button[@data-original-title='Delete']")).click();
	    driver.switchTo().alert().accept();
	}
}
