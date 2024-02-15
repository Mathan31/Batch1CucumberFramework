package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.PropertyReader;


public class AmazonHome {
	
	String sURL = PropertyReader.readDataFromProperty("environment", "amazon");
	private WebDriver driver;
	private By productNameTxt = By.id("twotabsearchtextbox");
	private By prodCatagoryDrop = By.id("searchDropdownBox");
	private By searchButton = By.id("nav-search-submit-button");
	private By searchResult = By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)[1]");
	
	public AmazonHome(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void navigateToAmazon() {
		driver.navigate().to(sURL);
		System.out.println("Title is : "+driver.getTitle());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // Wait until page loads
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void enterSearchText(String prodName) {
		WebElement oProduct;
		oProduct = driver.findElement(productNameTxt);
		oProduct.clear();
		oProduct.sendKeys(prodName);
	}
	
	public void selectCatagory(String prodCatagory) {
		WebElement oDropDown = driver.findElement(prodCatagoryDrop);
		Select oSelect = new Select(oDropDown);
		oSelect.selectByVisibleText(prodCatagory);
	}
	
	public void clickOnSearchButton() {
		 WebElement oButton = driver.findElement(searchButton);
		 oButton.click();
	}
	
	public void getSearchResult() {
		WebElement oResult;
		oResult = driver.findElement(searchResult);
		String sResult = oResult.getText(); //530,000
	    System.out.println("Result is : "+sResult);
	}
	
	
	

}
