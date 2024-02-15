package base;

import pages.PageObjectManager;

public class PicoTestConetext {
	
	private BrowserFactory testBase;
	private PageObjectManager pageObjectManager;
	
	public PicoTestConetext() {
		testBase = new BrowserFactory();
		pageObjectManager = new PageObjectManager(testBase.launchChromeBrower());
	}

	public BrowserFactory getTestBase() { 
		return testBase;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	

}
