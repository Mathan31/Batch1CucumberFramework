package steps;

import base.PicoTestConetext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHome;

public class AmazonSearchStep {

	AmazonHome amazonHome;
	
	public AmazonSearchStep(PicoTestConetext picoTestConetext) {
		amazonHome = picoTestConetext.getPageObjectManager().getAmazonPage();
	}
	
	@Given("Navigate to Amazon URL")
	public void navigate_to_amazon_url() {
		amazonHome.navigateToAmazon();
	}

	@When("Search the amazon product and Select the Catagory")
	public void search_the_amazon_product_and_select_the_catagory() {
		amazonHome.enterSearchText("Selenium");
		amazonHome.selectCatagory("Books");
		}

	@When("Click on amaon Search Button")
	public void click_on_amaon_search_button() {
	  amazonHome.clickOnSearchButton();
	}

	@Then("User should see the amazon search result")
	public void user_should_see_the_amazon_search_result() {
		amazonHome.getSearchResult();
	}

}
