package com.clipboardtest.reusablecomponents;

import java.io.FileInputStream;
import java.util.Properties;
import com.clipboardtest.constants.FrameworkConstants;
import io.opentelemetry.api.internal.StringUtils;
/**
 * Class to read the config properties file and then read the data from the config file
 * @author Anandha
 *
 */
public class PropertiesOperations {

	static Properties prop = new Properties();

	public static String getPropertyValueByKey(String key) {
		// 1. load data from properties file
		FileInputStream fis;
		try {
			fis = new FileInputStream(FrameworkConstants.getCONFIGFILEPATH());
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2. read data
		String value = prop.get(key).toString();

		if (StringUtils.isNullOrEmpty(value)) {
			try {
				throw new Exception("Value is not specified for key: " + key + " in properties file.");
			} catch (Exception e) {
			}
		}

		return value;
	}

}
