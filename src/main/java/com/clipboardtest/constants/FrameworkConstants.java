package com.clipboardtest.constants;


/**
 * Framework consatnts to mention path of the config file
 * @author Anandha
 */

public final class FrameworkConstants {


	private FrameworkConstants() {

	}

	//Getting Config file from resources folder
	private static final String CONFIGFILEPATH = System.getProperty("user.dir")+ "/resources/config.properties";

	public static String getCONFIGFILEPATH() {
		return CONFIGFILEPATH;

	}

}
