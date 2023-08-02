package com.amazon.in.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports generateExtentReport() {
	ExtentReports extentReports = new ExtentReports();
	File extentReporterFile = new File((System.getProperty("user.dir")+"\\test-output\\ExtentReports\\extentReport.html"));
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReporterFile);
	
	sparkReporter.config().setTheme(Theme.DARK);
	sparkReporter.config().setReportName("Mobiux Assignment");
	sparkReporter.config().setDocumentTitle("Amazon Test Automation Report");
	sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
	
	extentReports.attachReporter(sparkReporter);
		
	Properties prop = new Properties();
	File file = new File(System.getProperty("user.dir")
			+ "//src//main//java//com//amazon//in//qa//properties//globalProperties.properties");
	try {
	FileInputStream fis = new FileInputStream(file);
	prop.load(fis);
	}catch(Throwable e) {
		e.printStackTrace();
	}
	
	extentReports.setSystemInfo("Application URL", prop.getProperty("url"));
	extentReports.setSystemInfo("Browser name", prop.getProperty("browser"));
	
	extentReports.setSystemInfo("OS", System.getProperty("os.name"));
	extentReports.setSystemInfo("User", System.getProperty("user.name")); 
	extentReports.setSystemInfo("Java version", System.getProperty("java.version"));
	
	return extentReports;
	}
}


