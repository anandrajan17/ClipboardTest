package com.clipboardtest.driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
		String runmode = PropertiesOperations.getPropertyValueByKey("runmode");
		String remote_host = PropertiesOperations.getPropertyValueByKey("HOST_URI");

		// browser is set to chrome
		if (Objects.isNull(DriverManager.getDriver())) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				if (runmode.equalsIgnoreCase("remote")) {
					DesiredCapabilities capability = new DesiredCapabilities();
					capability.setBrowserName(browser);
					try {
						DriverManager.setDriver(new RemoteWebDriver(new URL(remote_host), capability));
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
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
		DriverManager.getDriver().get(url);

	}

	public static void quitDriver() {

		DriverManager.getDriver().quit();
		DriverManager.unload();

	}
}
