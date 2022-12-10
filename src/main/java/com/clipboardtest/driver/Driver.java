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
import com.clipboardtest.reusablecomponents.PropertiesOperations;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Driver Class is responsible for invoking and closing chrome browser and also setting the driver variable to DriverManager which handles the thread safety for the webdriver instance
 * @author Anandha 
 * @version 1.0
 * @since 1.0
 *
 */

public final class Driver {
	
	/**
	 * private constructor to avoid external instantiation
	 */

	public Driver() {

	}
	
	/**
	 * @param browser value will be passed from Config properties file value should be chrome
	 * @param url value will be passed from config properties value can be any web URL which needs to be tested
	 * @param runmode will be passed from config properties  value should be remote or local
	 * @param HOSR_URI  will be passed from config properties and should be the remote port value from docker 
	 */

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
