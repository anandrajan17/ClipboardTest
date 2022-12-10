package com.clipboard.pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.clipboardtest.constants.constantsElements;
import com.clipboardtest.driver.DriverManager;
import com.clipboardtest.extentreports.ExtentReportLogger;
import com.clipboardtest.extentreports.ExtentReprotAmazon;
import com.clipboardtest.utils.Utilssupport;

/**
 * Amazon HomePage
 * @author Anandha
 *
 */



public class AmazonHomePage {

	Utilssupport utils = new Utilssupport();

	//Click navigation button 
	public void clickHamburger() {
		DriverManager.getDriver().findElement(By.id(constantsElements.HAMBURGUER_MENU_ID)).click();
		System.out.println("Nav button clicked");
		ExtentReportLogger.pass("All Navigation is button Clicked");
	}
    //Click TV Applicance option
	public void selectTVAppliance() {

		utils.hoverAndClick(By.linkText(constantsElements.TV_APPLIANCES_ELECTRONICS));
		ExtentReportLogger.pass("TV & Electronics and Appliance is selected");
	}
	//Select Television
	public void selectTelevison() {
		utils.hoverAndClick(By.linkText(constantsElements.TELEVISIONS));
		ExtentReportLogger.pass("Televison is selected");
	}
	//Select Samsung from Brand Section
	public void selectCheckoxIntoTitle(String title, String checkboxValue) {
		utils.waitForElementToBePresent(By.cssSelector(constantsElements.FILTER_OPTIONS));

		List<WebElement> filterOptions = DriverManager.getDriver()
				.findElements(By.cssSelector(constantsElements.FILTER_OPTIONS));
		int e = 0;
		for (int i = 0; i < filterOptions.size(); i++) {
			String val = filterOptions.get(i).findElement(By.cssSelector("span")).getText();
			if (val.equalsIgnoreCase(title)) {
				e = i + 1;
				break;
			}
		}
		//Select Samsung from Brand Section
		List<WebElement> optionCheckboxes = DriverManager.getDriver().findElements(
				By.cssSelector(constantsElements.FILTER_OPTIONS_CHECKBOXES.replace("@@ID@@", String.valueOf(e))));
		for (int i = 0; i < optionCheckboxes.size(); i++) {
			String val = optionCheckboxes.get(i).getText();
			if (val.equalsIgnoreCase(checkboxValue)) {
				optionCheckboxes.get(i).click();
				break;
			}
			ExtentReprotAmazon.reprottest.pass("Samsung Brand is selected");
		}
	}
}
