package com.configuration_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {
		p = new Properties();

		File f = new File(
				"C:\\Users\\SAKTHI\\eclipse-workspace\\Maven_1st_project\\src\\main\\java\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p.load(fis);

	}

	public String geturl() throws Throwable {

		String url = p.getProperty("geturl");

		return url;
	}

	public String getusername() throws Throwable {

		String username = p.getProperty("Username");

		return username;

	}

	public String getpassword() throws Throwable {

		String password = p.getProperty("password");

		return password;

	}

}
