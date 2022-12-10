package com.clipboardtest.amazontest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.clipboard.pages.AmazonHomePage;
import com.clipboard.pages.AmazonTVPage;
import com.clipboard.pages.AmazonTvDetails;
import com.clipboard.pages.AmazonTvResult;
import com.clipboardtest.chromelauncher.chromelauncher;
import com.clipboardtest.extentreports.ExtentReprotAmazon;
import com.clipboardtest.utils.Utilssupport;

/**
 * Testcase executor class run this to start the automation
 * 
 * @author Anandha
 *
 */
public class AmazonTest extends chromelauncher {

	private AmazonTest() {

	}

	@Test

	public void amazon_test() {

		ExtentReprotAmazon.testcase("Amazon TV Test");

		AmazonHomePage TestcaseExe = new AmazonHomePage();
		AmazonTVPage FilterExe = new AmazonTVPage();
		AmazonTvResult ResultExe = new AmazonTvResult();
		Utilssupport UtilExe = new Utilssupport();
		AmazonTvDetails DetailExe = new AmazonTvDetails();

		try {
			TestcaseExe.clickHamburger();

			TestcaseExe.selectTVAppliance();
			TestcaseExe.selectTelevison();
			//TestcaseExe.selectCheckoxIntoTitle("Brands", "Samsung");
			FilterExe.sortByPriceHighToLow();
			ResultExe.selectResultByIndex(0);
			UtilExe.switchTab(1);

			// to get the Details of the item
			List<WebElement> bullets = DetailExe.getBulletList();
			for (int i = 0; i < bullets.size(); i++) {
				System.out.println("*" + bullets.get(i).getText());
				// log.info("*" + bullets.get(i).getText());
				ExtentReprotAmazon.reprottest.pass("*" + bullets.get(i).getText());

			}
		} catch (Exception e) {
			ExtentReprotAmazon.reprottest.fail(e + "Test Case have Failed");

		}

		System.out.println("Test has Executed successfully");

	}

}
