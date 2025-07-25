package com.bs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath="//textarea[@title='Search']")
	private WebElement search;

	

	public WebElement getSearch() {
		return search;
	}

}
