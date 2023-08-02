package com.amazon.in.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Searchbar {

	WebDriver driver;

	public PO_Searchbar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbarTextBox;

	@FindBy(id = "nav-search-submit-button")
	WebElement searchButton;

	@FindBy(xpath = "//span[text()='Analogue']")
	WebElement analogueCheckBox;

	@FindBy(xpath = "//span[text()='Leather']")
	WebElement leatherCheckBox;

	@FindBy(xpath = "//li[@aria-label='Titan']/span/a[1]")
	WebElement titanCheckBox;

	@FindBy(xpath = "//span[text()='25% Off or more']")
	WebElement discountLink;

	@FindBy(xpath ="((//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20'])[5]//a/span)[1]")
	WebElement fifthElement;

	public void enterInputInSearchBar(String itemName) {
		searchbarTextBox.sendKeys(itemName);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void clickAnalogueCheckBox() {
		analogueCheckBox.click();
	}

	public void clickLeatherCheckBox() {
		leatherCheckBox.click();
	}

	public void clickTitanCheckBox() {
		titanCheckBox.click();
	}

	public void clickDiscountLink() {
		discountLink.click();
	}
	
	public String getFifthElement() {
		String fifthItem = fifthElement.getText();
		return fifthItem;
	}
}
