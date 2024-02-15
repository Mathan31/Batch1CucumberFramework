package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "./src/test/resources/features/",
		glue = {"steps","hooks"}, 
		tags = "@Smoke",
		plugin = {"pretty","json:target/reports/search.json","html:target/reports/search.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}		
		)


public class TestNGRunner extends AbstractTestNGCucumberTests{

}
