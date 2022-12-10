package com.clipboardtest.extentreports;


/**
 * Extenent ReportLogger for Pass,Fail and Skip test cases 
 * @author Anandha
 *
 */
public final class ExtentReportLogger {
	
	private ExtentReportLogger() {}
		
		public static void pass(String message) {
			ExtentReprotAmazon.reprottest.pass(message);
			
		}
		
		public static void fail(String message) {
			ExtentReprotAmazon.reprottest.fail(message);
			
		}
		
		public static void skip(String message) {
			ExtentReprotAmazon.reprottest.skip(message);
			
		}
		
	

}