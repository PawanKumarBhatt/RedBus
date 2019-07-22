package com.RedBus.web.webDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.Parameters;

import com.RedBus.web.init.GlobalVariables;

public class WebDriverInitialization {
    private static WebDriver driver;
	public static WebDriver driverInitialization(String env) {
		GlobalVariables.browserName=env;
		if (GlobalVariables.browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		} else if (GlobalVariables.browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/resources/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} else if(GlobalVariables.browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/main/resources/geckodriver.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		return driver;
	}

}
