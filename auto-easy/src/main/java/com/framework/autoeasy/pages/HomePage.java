package com.framework.autoeasy.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.framework.autoeasy.reusablelibrary.ReusableLibrary;

public class HomePage{

	private WebDriver driver; 
	private static By homePageLogo = By.xpath("//a[@title='My Store']");
	private ReusableLibrary objcommon = new ReusableLibrary();
	public HomePage(WebDriver driver) {
		
		 this.driver = driver;
		
	}
	
	
	public boolean homePageLogo() {
		
		WebElement logo = driver.findElement(homePageLogo);
		return ReusableLibrary.isElementDisplayed(logo);
	}
	
	
}
