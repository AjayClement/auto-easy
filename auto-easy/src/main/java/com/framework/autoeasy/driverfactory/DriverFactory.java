package com.framework.autoeasy.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.framework.autoeasy.propertyreader.PropertyReader;

public class DriverFactory {

	


	    protected static WebDriver driver;


	    public DriverFactory() {
	        initialize();
	    }

	    public void initialize() {
	        if (driver == null)
	            createNewDriverInstance();
	    }

	    private void createNewDriverInstance() {
	    	String browser = new PropertyReader().readProperty("browser");
	    	String driverPath =new PropertyReader().readProperty("driverPath");
	        if (browser.equals("firefox")) {
	            driver = new FirefoxDriver();
	        } else if 
	        	 (browser.equals("chrome")) {
	        	System.setProperty("webdriver.chrome.driver", driverPath );
		            driver = new ChromeDriver();
	        }else
	            System.out.println("can't read browser type");
	        }
	    

	    public WebDriver getDriver() {
	        return driver;
	    }

	    public void destroyDriver() {
	        driver.quit();
	        driver = null;
	    }
		
	
	
	
	
	
}
