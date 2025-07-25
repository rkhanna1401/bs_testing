package com.bs.manager;

import org.openqa.selenium.WebDriver;

import com.bs.pages.BasePage;
import com.bs.pages.HomePage;


public class WorkflowManager {

	private BasePage basePage;
	private HomePage homePage;

	
	public BasePage getBasePage(WebDriver driver) {
		this.basePage = new BasePage(driver);
		return this.basePage;
	}
	
	public HomePage getHomePage(WebDriver driver) {
		this.homePage = new HomePage(driver);
		return this.homePage;
	}
	
	
}
