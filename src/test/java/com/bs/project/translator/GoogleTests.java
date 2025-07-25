package com.bs.project.translator;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;

import com.bs.manager.TestManager;

public class GoogleTests extends TestManager {

	private List<String> titles;
	String englishTitle;
	List<String> convertedTitles = new ArrayList<String>();

	@Test
	public void retrieveTitle() {
		homePageWorkflow.search();
	
	}

	
}
