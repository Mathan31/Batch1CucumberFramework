package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.PicoTestConetext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class PreAndPostCondition {
	
	private WebDriver driver; 
	
	public PreAndPostCondition(PicoTestConetext picoTestConetext) {
		driver = picoTestConetext.getTestBase().launchChromeBrower();
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterStep
	public void takescreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "screenFailure");
		}
	}
	
	

}
