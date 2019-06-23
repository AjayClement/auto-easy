package com.framework.autoeasy.reusablelibrary;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.autoeasy.driverfactory.DriverFactory;



public class ReusableLibrary extends DriverFactory {

	public void waitForVisibilityOfElem(WebElement element, WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public boolean isElementDisplayed(WebElement element) {

		boolean state = element.isDisplayed();
		return state;
	}

	public void enterText(WebElement element, WebDriver driver, String text) {
		waitForVisibilityOfElem(element, driver);
		element.sendKeys(text);

	}

	public void click(WebElement element, WebDriver driver) {
		waitForVisibilityOfElem(element, driver);
		element.click();
	}

	public void hoverElement(String xpath, WebDriver driver) {

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();

	}

	public void implictWaitOn(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public void implicitWaitOff(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	public boolean isElementEnabled(WebElement element) {

		boolean state = element.isEnabled();
		return state;

	}

	public boolean isElementSelected(WebElement element) {

		boolean state = element.isSelected();
		return state;
	}

	public void selectValue(WebElement element, String value, String method) {

		Select select = new Select(element);

		switch (method) {

		case "byIndex":

			select.selectByIndex(Integer.valueOf(value));

		case "byValue":

			select.selectByValue(value);

		case "byVisibleText":

			select.selectByVisibleText(value);
		}
	}

	public void checkCheckBox(WebElement element, String operation) {

		switch (operation) {

		case "check":
			if (!isElementSelected(element)) {
				element.click();
			}

		case "unCheck":
			if (isElementSelected(element)) {
				element.click();
			}
		}

	}

	public WebElement matchElementByText(List<WebElement> elements, String text) {

		WebElement elementMatch = null;
		for (WebElement e : elements) {

			if (e.getText().equals(text)) {

				elementMatch = e;
				break;
			}

		}
		return elementMatch;

	}
}
