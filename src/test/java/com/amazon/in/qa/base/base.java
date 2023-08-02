package com.amazon.in.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.amazon.in.qa.utils.utilities;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public void loadPropertiesFile() throws IOException {
		prop = new Properties();
		File file = new File(System.getProperty(
				"user.dir")+ "//src//main//java//com//amazon//in//qa//properties//globalProperties.properties");
		FileInputStream fis = new FileInputStream(file);	
		prop.load(fis);
	}
	public WebDriver initialiseBrowser_And_OpenApplication(String browserName){
		
			if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
			}
			else if(browserName.equals("firefox")) {
				driver = new FirefoxDriver();		
			}
			else if(browserName.equals("edge")) {
				driver = new EdgeDriver();
			}
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(utilities.ImplicitWait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(utilities.LoadWait));
			return driver;
		}
	}


