package com.clipboardtest.driver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.clipboardtest.extentreports.ExtentReportLogger;
import com.clipboardtest.reusablecomponents.PropertiesOperations;
import com.clipboardtest.driver.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {

	public Driver() {

	}

	
	public static void initDriver() {
		// Browser and URL are loaded from Config properties file
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = PropertiesOperations.getPropertyValueByKey("url");
		
		ExtentReportLogger.pass("Result");

		//browser is set to chrome 
		if (Objects.isNull(DriverManager.getDriver())) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				DriverManager.setDriver(new ChromeDriver());
				
				
				System.out.println("Launched chrome");
			}

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			DriverManager.setDriver(driver);
			

		}

		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverManager.getDriver().manage().window().maximize();
		System.out.println("window maximized");

		DriverManager.getDriver().get(url);
		System.out.println("URL LOADED");
		

	}

	public static void quitDriver() {

		DriverManager.getDriver().quit();
		DriverManager.unload();

	}
}
