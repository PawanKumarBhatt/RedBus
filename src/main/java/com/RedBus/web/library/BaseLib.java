package com.RedBus.web.library;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.RedBus.web.init.GlobalVariables;
import com.RedBus.web.webDriverManager.WebDriverInitialization;

public class BaseLib {
	@BeforeClass
	@Parameters("browser_name")
	public void launchAndLogin(String env) {
		GlobalVariables.driver = WebDriverInitialization.driverInitialization(env);
		if (GlobalVariables.driver != null) {
			// Read value of URL from Excel
			GlobalVariables.driver.manage().deleteAllCookies();
			GlobalVariables.driver.get("https://www.redbus.com/");
		} else {
			System.out.println("Driver is not initialized");
		}

	}

	@AfterClass
	public void closeBrowser() {
		GlobalVariables.driver.quit();
	}

}
