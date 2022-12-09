package com.clipboardtest.driver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.clipboardtest.reusablecomponents.PropertiesOperations;

import io.github.bonigarcia.wdm.WebDriverManager;


public final class Driver {

	public Driver() {

	}

	@Test
	public static void initDriver() {
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = PropertiesOperations.getPropertyValueByKey("url");
		WebDriverManager.chromedriver().setup();
		DriverManager.setDriver(new ChromeDriver());
		DriverManager.getDriver().get(url);
		System.out.println("URL LOADED");
		DriverManager.unload();
	}
}
