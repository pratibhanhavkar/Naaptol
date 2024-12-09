package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NaaptolHomePage {
	
	@FindBy (xpath="//input[@id='header_search_text']")private WebElement searchfield;
	@FindBy (xpath ="(//div[@class='search']//a)[2]") private WebElement search;
	@FindBy (xpath ="//div[@class='grid_Square ']") private List<WebElement> productList;//12product
	@FindBy (xpath = "//div[@id='square_Details']//h1")private WebElement productNameOnQuickView;

	@FindBy (xpath="//div[@class='errorMsg']")private WebElement errormsg;
    
	
	//Additional Xpath
	@FindBy (xpath="//a[@id='login-panel-link']")private WebElement login;
	@FindBy (xpath="//a[text()='Track Order']")private WebElement trackorder;
    @FindBy (xpath="//select[@id='localization_dropdown']")private List<WebElement> language;
    @FindBy (xpath="//span[@class='mobApp-Icon']")private WebElement downloadapp;
    @FindBy (xpath="//span[@class='cartIcon']")private WebElement carticon;
  
    
    public NaaptolHomePage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
	}
	
  
    public void ClickonSearch(String mobile) {
    	searchfield.click();
    }
    public void ClickOnSearch() {
    	search.click();
    }
    public void EnterProductToSearch(String product) {
    	searchfield.sendKeys(product);
    }
    public void clickOnLogin() {
    	login.click();
    }
    public void ClickOnTrackOrder() {
    	trackorder.click();
    }
 
	public int getNumberOfProductDisplayed() {
	
		return productList.size();
	}
	
	public String getErrorMessage() {
		return errormsg.getText();
	
	}
	
}
