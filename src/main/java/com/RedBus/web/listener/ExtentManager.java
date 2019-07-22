package com.RedBus.web.listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	private static ExtentReports extent;
	private static ExtentHtmlReporter htmlReporter;
	public static ExtentReports getInstance() {
		if (extent == null)
			createInstance(".test-output/ExtentReports/HtmlReport.html");
		return extent;
	}

	public static ExtentReports createInstance(String fileName) {
	    
		extent = new ExtentReports();
		System.out.println("In extent");
		return extent;
	}

}
