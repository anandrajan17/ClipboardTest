package com.clipboard.pages;

import org.openqa.selenium.By;

import com.clipboardtest.constants.constantsElements;
import com.clipboardtest.driver.DriverManager;
import com.clipboardtest.extentreports.ExtentReportLogger;
import com.clipboardtest.utils.Utilssupport;

public class AmazonHomePage {
	
	Utilssupport utils = new Utilssupport();
	
	public void clickHamburger() {
		DriverManager.getDriver().findElement(By.id(constantsElements.HAMBURGUER_MENU_ID)).click();
		System.out.println("Nav button clicked");
		ExtentReportLogger.pass("All Navigation is button Clicked");
	}

}
