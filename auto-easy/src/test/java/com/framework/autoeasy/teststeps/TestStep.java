package com.framework.autoeasy.teststeps;


import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;

import com.framework.autoeasy.driverfactory.DriverFactory;
import com.framework.autoeasy.pages.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TestStep {
	
	private  WebDriver driver;
	private HomePage objHomePage;
	private ExtentReports reports;
	private ExtentTest test;
	private DriverFactory objDriverFactory;
	
	@Before
	public void before() {
        objDriverFactory = new DriverFactory();
		driver = objDriverFactory.getDriver();
        objHomePage = new HomePage(driver);
        reports = new ExtentReports("C:/Auto_GitHub_Wrksp/auto-easy/auto-easy/target/ExtentReports", true);
        test = reports.startTest("Demo");
        System.out.println("Before scenario");
    }	
	@Given("the user is on landing page")
	public void the_user_is_on_landing_page() {
	 
		objDriverFactory.launchUrl();
		if (objHomePage.homePageLogo()) {
			
			test.log(LogStatus.PASS, "Launch Logo", "The application launched successfully");
			
		}else {
			test.log(LogStatus.FAIL, "Launch Logo", "The application did not launch successfully");
		}
		
	}

	@When("the user selects women clothing on the landing page")
	public void the_user_selects_women_clothing_on_the_landing_page() {
	  
		
		
	}

	@Then("the application must navigate the user to the womens clothing page")
	public void the_application_must_navigate_the_user_to_the_womens_clothing_page() {
	    
	}	
	
    
	@After
	public void after() {
		objDriverFactory.destroyDriver();
	}
	

}
