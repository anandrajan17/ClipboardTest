package com.clipboardtest.extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * Extent Report generator where theme can be changed and auto display of the browser after the test code execution
 * @author apple
 *
 */
		
public final class ExtentReprotAmazon {

	private ExtentReprotAmazon() {
	}
	

	private static ExtentReports extent;
	public static ExtentTest reprottest;
	


	public static void initReprots() {
		if (Objects.isNull(extent)) {

			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("amazon.html");
			extent.attachReporter(spark);

			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("Amazon Test Report");
			spark.config().setReportName("Amazon TV Test");

		}
	}

	public static void testcase(String testcasename) {
		reprottest= extent.createTest(testcasename);

	}

	public static void closeReprots() throws IOException {
		if(Objects.nonNull(extent)) {
			extent.flush();
		}
		
		Desktop.getDesktop().browse(new File("amazon.html").toURI());
	}

}

