package stepdefinition;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	 int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	 
	@Then("Enter all the Necessary details and Save")
	public void enter_all_the_necessary_details_and_save() {

		//Enter Company Name
		driver.findElement(By.id("input-name")).sendKeys(CouponName);
		//Enter code
		driver.findElement(By.name("code")).sendKeys(String.valueOf(random_int));
	//Enter Type
		driver.findElement(By.name("type")).sendKeys("100");
		//Enter Discount
		driver.findElement(By.name("discount")).sendKeys("10");
		//Enter Total amount
		driver.findElement(By.name("total")).sendKeys("10000");
		
	    //Select customer login radio button
		
		driver.findElement(By.xpath("//input[@name='logged' and @value='1']")).click();
		//select radio button for free shipping
		driver.findElement(By.xpath("//input[@name='shipping' and @value='1']")).click();
		//Enter the Products details
		driver.findElement(By.name("product")).sendKeys("This is for testing purpose");
		// Enter the Category
		
		driver.findElement(By.name("category")).sendKeys("Watches");
		//Select Start date
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
		driver.findElement(By.xpath("//td[@class='day active today']")).click();
		
		//Select End date
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
		driver.findElement(By.xpath("//td[@class='day active']")).click();
		//uses per coupon
		driver.findElement(By.name("uses_total")).sendKeys("This is for testing purpose");
		//uses per customer
		driver.findElement(By.name("uses_customer")).sendKeys("This is for testing purpose");
		//select status
		Select status = new Select(driver.findElement(By.name("status")));
		status.selectByVisibleText("Enabled");
		//Select save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@When("Edit Coupon Page Loaded, Update the coupon name")
	public void edit_coupon_page_loaded_update_the_coupon_name() {
		
		//Edit the Coupon Name
		driver.findElement(By.id("input-name")).clear();
		driver.findElement(By.id("input-name")).sendKeys(EditedCouponName);
		//Select save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}



}
