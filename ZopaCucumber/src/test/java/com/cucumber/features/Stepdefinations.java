package com.cucumber.features;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.TestBase;
import com.cucumber.pages.HomePage;

public class Stepdefinations extends TestBase{
TestBase cucumber=new TestBase();
	   
      @Given("^User opens \"([^\"]*)\"$")
       public void user_opens(String browser) throws Throwable {
	       System.out.println("user able to launch:");
		   cucumber.openBrowser(browser);
	   }

      @When("^User navigate to \"([^\"]*)\"$")
      public void user_navigate_to(String Url) throws Throwable {
	      System.out.println("user able open Url:"+Url);
	      cucumber.navigate(Url);
	   }

	   @Then("^User able to click on zopa loan button$")
	   public void user_able_to_click_on_zopa_loan_button() throws Throwable {
	      HomePage hp=PageFactory.initElements(driver,HomePage.class);
	      hp.clickloanbutton();
	   }
   
	   @Given("^User able to click on quote radiobutton$")
	   public void user_able_to_click_on_quote_radiobutton() throws Throwable {
		   HomePage hp=PageFactory.initElements(driver,HomePage.class);
		   hp.clickradiobutton();
	   }

	   @Given("^User should click on get my personalised rates button$")
	   public void user_should_click_on_get_my_personalised_rates_button() throws Throwable {
		   HomePage hp=PageFactory.initElements(driver,HomePage.class);
		   hp.clickradiobutton();
	   }

	  
	      
	   }






