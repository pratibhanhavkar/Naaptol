package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaaptolProductResultPage {
	private static final int index = 0;
	@FindBy (xpath="//div[@class='grid_Square ']")private List<WebElement> products;
	@FindBy (xpath="//a[@class='bt_compare icon chat quickFancyBox']")private List<WebElement> productquickview;
	@FindBy (xpath = "//div[@class='item_title']//a")private List<WebElement> productTitle;
	@FindBy (xpath = "//span[@class='offer-price']")private List<WebElement> offerPrice;
	 @FindBy (xpath="//a[@class='red_button icon chat']")private WebElement clickheretobuy;
	 @FindBy (xpath="//div[@id='pincodeForDeliveryDiv_provide_0']//input[@placeholder='Enter Pincode']")private WebElement pincode;
	 @FindBy (xpath="(//a[@class='red_button2'])[2]")private WebElement proceedtocheckout;
	 @FindBy (xpath="(//input[@placeholder='Enter mobile number'])[2]")private WebElement mobilenumber;
	 @FindBy (xpath="(//input[@class='btn-login btn-blueBg'])[3]")private WebElement continuebutton;
	 @FindBy (xpath = "//div[@id='square_Details']//h1")private WebElement productNameOnQuickView;
	 @FindBy (xpath = "//div[@id='square_Details']//span[@class='offer-price']")private WebElement productPriceOnQuickView;
	 
	 
	public NaaptolProductResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void moveToDesiredProduct(WebDriver driver, int index) {
		Actions actions = new Actions(driver);
		actions.moveToElement(products.get(index));
		actions.perform();
	}
	 
	public void selectdesiredProduct(int index) {
		products.get(index).click();
	}
	
	public void clickOnQuickView(int index) {
		productquickview.get(index).click();
	}
	
	public String getProductTitle(int index) {
		return productTitle.get(index).getText();
	}
	
	public String getProductPrice(int index) {
		return offerPrice.get(index).getText();
	}
	
	public String getProductNameOnQuickView() {
		return productNameOnQuickView.getText();
	}
		
	public String getProductPriceOnQuickView() {
	String [] p =	productPriceOnQuickView.getText().split(" ");
	return p[0];
	}
	public void clickHereToBuy() {
		clickheretobuy.click();
	}
	public void EnterPinCode() {
		pincode.sendKeys("443001");
	}
	public void ClickOnProceedToCheckOut() {
		proceedtocheckout.click();
	}
	public void EnterMobileNumber() {
		mobilenumber.sendKeys("9850996016");
	}
	
}


