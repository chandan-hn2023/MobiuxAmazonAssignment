package com.amazon.in.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.in.qa.base.base;
import com.amazon.in.qa.pageobjects.PO_Searchbar;

public class TC_SearchbarTest extends base {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void accessApplication() throws IOException {
		loadPropertiesFile();
		driver = initialiseBrowser_And_OpenApplication(prop.getProperty("browser"));
	}
	@Test
	public void get_5th_Item_From_Search_Results() throws InterruptedException {
		
		PO_Searchbar sb = new PO_Searchbar(driver);
		sb.enterInputInSearchBar(prop.getProperty("productName"));
		sb.clickOnSearchButton();
		sb.clickAnalogueCheckBox();
		sb.clickLeatherCheckBox();
		sb.clickTitanCheckBox();
		sb.clickDiscountLink();
		Thread.sleep(800);
		String fifthItem = sb.getFifthElement();
		System.out.println("The 5th item from the search is: "+fifthItem);

	}

}
