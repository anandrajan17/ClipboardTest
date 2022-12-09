package com.clipboardtest.driver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {

	public Driver() {

	}

	@Test
	public static void initDriver() {
		String url = "https://amazon.in";
		WebDriverManager.chromedriver().setup();
		DriverManager.setDriver(new ChromeDriver());
		DriverManager.getDriver().get(url);
		System.out.println("URL LOADED");
	}
}
