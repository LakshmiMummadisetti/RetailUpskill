package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddNewCouponPage;
import pages.CouponsPage;
import pages.DashboardPage;
import pages.Loginpage;

public class StepDefinitionclass {
	Loginpage loginpage = new Loginpage();
	DashboardPage dashboardPage = new DashboardPage();
	CouponsPage couponpage = new CouponsPage();
	AddNewCouponPage addNewCouponPage = new AddNewCouponPage();

	@Given("User Navigated to Login Page and login with user id and password")
	public void login() {
		loginpage.user_navigated_to_login_page();
	}

	@Then("Retail Login Page should load")
	public void dashboard1() {
		dashboardPage.retail_login_page_should_load();
	}

	@Given("Click on Coupons")
	public void dashboard() {
		dashboardPage.click_on_coupons();
	}

	@Then("Click on Add Coupon")
	public void addCoupon() {
		couponpage.click_on_add_coupon();
	}

	@Then("Enter all the Necessary details and Save")
	public void enter_all_necessary_deatils() {
		addNewCouponPage.enter_all_the_necessary_details_and_save();
	}

	@Then("Verify the added Coupon")
	public void verify_the_added_coupon() {
		couponpage.verify_the_added_coupon();
	}

	@Then("Click Edit the added Coupon")
	public void edit_coupon_code() {
		couponpage.edit_the_added_coupon();
	}

	@When("Edit Coupon Page Loaded, Update the coupon name")
	public void update_the_couponname() {
		addNewCouponPage.edit_coupon_page_loaded_update_the_coupon_name();
	}

	@When("Verify the Edited coupon in coupon list")
	public void verify_the_editedcoupon() {
		couponpage.verify_the_edited_coupon_in_coupon_list();
	}

	@When("Delete the coupon")
	public void deletecoupon() {
		couponpage.delete_the_coupon();
	}
}
