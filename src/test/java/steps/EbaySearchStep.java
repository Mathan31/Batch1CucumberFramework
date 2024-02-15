package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import base.PicoTestConetext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EbayHome;

public class EbaySearchStep {
	
	EbayHome ebayHome;
	
	public EbaySearchStep(PicoTestConetext picoTestConetext) {
		ebayHome = picoTestConetext.getPageObjectManager().getEbayPage();
	}

	@Given("Navigate to Ebay URL")
	public void navigate_to_ebay_url() {
		ebayHome.navigateToEbay();
		}

	@When("Search the product and Select the Catagory")
	public void search_the_product_and_select_the_catagory() {
		ebayHome.enterSearchText("iPhone");
		ebayHome.selectProdCatagory("Cell Phones & Accessories");
	}
	
	@When("Search the product as {string} and Select the Catagory as {string}")
	public void search_the_product_as_and_select_the_catagory_as(String prodName, String prodCatagory) {
		ebayHome.enterSearchText(prodName);
		ebayHome.selectProdCatagory(prodCatagory);
	}

	@When("^Search the multiple product as (\\w+) and Select the multiple Catagory as ([^1-9]+)$")
	public void search_the_multiple_product_as_selenium_and_select_the_multiple_catagory_as_books(String prodName,String prodCatagory) {
		ebayHome.enterSearchText(prodName);
		ebayHome.selectProdCatagory(prodCatagory);
	}
	
	@When("Search the product from the below data table as List")
	public void search_the_product_from_the_below_data_table_as_list(DataTable dataList) {
		List<List<String>> listRow = dataList.asLists();
		for (List<String> row : listRow) {
			String prodName = row.get(0);
			String prodCat = row.get(1);
			ebayHome.enterSearchText(prodName);
			ebayHome.selectProdCatagory(prodCat);
			ebayHome.clickOnSearchButton();
		}
	}
	
	@When("Click on Search Button")
	public void click_on_search_button() {
		ebayHome.clickOnSearchButton();
	}

	@Then("User should see the search result")
	public void user_should_see_the_search_result() {
		ebayHome.getSearchResult();
	}
}
