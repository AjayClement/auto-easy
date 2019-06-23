package com.framework.autoeasy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.framework.autoeasy.reusablelibrary.ReusableLibrary;

public class HomePage {

	private WebDriver driver;
	private ReusableLibrary objcommon = new ReusableLibrary();

	private final By HOME_PAGE = By.xpath("//a[@title='My Store']");

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	public boolean homePageLogo() {

		WebElement logo = driver.findElement(HOME_PAGE);
		return objcommon.isElementDisplayed(logo);
	}

}
