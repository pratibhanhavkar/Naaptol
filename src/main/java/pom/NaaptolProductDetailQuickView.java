package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaaptolProductDetailQuickView extends BasePagePrice{
	@FindBy (xpath="//span[text()='Quick View']")private WebElement quickviewofproduct;
    @FindBy (xpath ="div[id='QuickView']")private WebElement productdetail;
    @FindBy (xpath="//div[@id='square_Details']//h1")private WebElement productnameonquickview;
	@FindBy (xpath="//div[@id='square_Details']//span[@class=\"offer-price\"]")private WebElement quickviewProductPrice;
	
	
	public NaaptolProductDetailQuickView(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getProductNamefromQuickView() {
		return productnameonquickview.getText();
		
	}
	public double getProductPriceFromQuickView() {
		String [] p= quickviewProductPrice.getText().split(" ");
		return Double.parseDouble(removeCommaFromString(p[0]));
	}
	
	public void clickOnQuickView() {
		quickviewofproduct.click();
	}
	public void  clickonproductdetail() {
		productdetail.click();
	}
	
}
