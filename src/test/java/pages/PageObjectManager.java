package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager { 
	
	private WebDriver driver;
	private AmazonHome amazonHome;
	private EbayHome ebayHome;  
	
	public PageObjectManager(WebDriver driver) { 
		this.driver = driver;
	}
	
	public EbayHome getEbayPage() {
		if(ebayHome == null) {
			ebayHome = new EbayHome(driver);
		}
		return ebayHome;
	}
	
	public AmazonHome getAmazonPage() {
		if(amazonHome == null) {
			amazonHome = new AmazonHome(driver);
		}
		return amazonHome;
	}
	

}
