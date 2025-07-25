package com.bs.workflows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bs.manager.WorkflowManager;

public class HomePageWorkflow {

	private WebDriver driver;
	private WorkflowManager workflowManager;


	public HomePageWorkflow(WebDriver driver) {
		this.driver = driver;
	
		workflowManager = new WorkflowManager();
	}

	public void search() {	
		
		WebElement el = workflowManager.getHomePage(driver).getSearch();
		
		el.click();
	}

}
