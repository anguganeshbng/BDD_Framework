package com.envision.ui.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadInputDetails {

	public String readPropertiesFile(String filePath, String key) {
		String value = null;
		File file = new File(filePath);
		try {
			FileInputStream fis = new FileInputStream(file);
			Properties p = new Properties();
			try {
				p.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			value = p.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;

	}

	
	
}
