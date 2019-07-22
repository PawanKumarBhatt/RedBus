package com.RedBus.web.listener;

import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



public class ExtentTestManager {
	// static Map extentTestMap = new HashMap();
/*	static Map<Integer, ExtentTest> extentTestMap = new HashMap<Integer, ExtentTest>();
	    static ExtentReports extent = ExtentManager.getReporter();
	 
	    public static synchronized ExtentTest getTest() {
	        return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
	    }
	 
	    public static synchronized void endTest() {
	    	
	        extent.endTest((ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId())));
	    }
	 
	    public static synchronized ExtentTest startTest(String testName, String desc) {
	        ExtentTest test = extent.createTest(testName, desc);
	        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
	        return test;
	    }
*/
}
