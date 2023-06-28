package org.example.stepdefinitions;


import java.io.IOException;

import org.example.pageobjects.FormPage;
import org.example.utilities.AndroidBaseTest;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions extends AndroidBaseTest{
	public AndroidDriver driver;
	public FormPage formpage;
	@Given("open general store applicatiion")
	public void open_general_store_applicatiion() throws IOException, InterruptedException {
	   System.out.println("open general store app");
	   driver=ConfigureAppium();
		Thread.sleep(4000);
	}

	@When("Enter drop down {string}")
	public void enter_drop_down(String drop) {
		 formpage=new FormPage(driver);
		 formpage.setCountrySelection(drop);
	}

	@When("Enter username {string}")
	public void enter_username(String name) {
		   System.out.println(name);

	}

	@When("Select gender {string}")
	public void select_gender(String gender) {
		   System.out.println(gender);

	}

	@Then("click submit")
	public void click_submit() {
		   System.out.println("Click submit");

	}

}
