package com.clipboardtest.chromelauncher;
import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.clipboardtest.driver.Driver;
import com.clipboardtest.extentreports.ExtentReprotAmazon;


/**
 * Browser Launcher ExtentReproter init and quit,browser inti and quit
 * 
 * @author Anandha
 * @version 1.0
 * @since 1.0
 */
public class chromelauncher {

	protected chromelauncher() {

	}

	//Extent Reproter Intiated before Suite
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Extent Report Intitated");
		ExtentReprotAmazon.initReprots();
	}

	// Extent Reproter Closed after suite
	@AfterSuite
	public void afterSuite() throws IOException {
		System.out.println("Extent Report Cosed");
		ExtentReprotAmazon.closeReprots();
	}

	// Chrome Driver Initialized
	@BeforeMethod
	protected void setUp() {

		Driver.initDriver();

	}

	// Chrome Driver Quit
	@AfterMethod
	protected void teardown() {
		Driver.quitDriver();
		System.out.println("after class method");

	}

}
