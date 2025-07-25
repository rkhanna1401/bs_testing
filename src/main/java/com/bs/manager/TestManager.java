package com.bs.manager;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.bs.drivermanager.SeleniumWebDriverManager;

import com.bs.workflows.HomePageWorkflow;


public class TestManager {

	public static WorkflowManager workflowManager;
	public static HomePageWorkflow homePageWorkflow;


	public void initializeWorkflowObjects(WebDriver driver) {
		homePageWorkflow = new HomePageWorkflow(driver);
		
		workflowManager = new WorkflowManager();
	}

	@BeforeSuite
	public void init() {
		WebDriver driver = SeleniumWebDriverManager.getDriver("chrome");
		initializeWorkflowObjects(driver);
	
		workflowManager.getBasePage(driver).load();
	}

	@AfterSuite
	public void cleanUp() {
		SeleniumWebDriverManager.quitDriver();
	}
}
