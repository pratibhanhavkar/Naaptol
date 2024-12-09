package pom;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Browser;

public class naaptolChildBrowserPage {
	     WebDriver driver = Browser.LunchApplication();
	     @FindBy (xpath = "//a[@id='cart-panel-button-0']")private WebElement clickheretobuy;
    	 @FindBy (xpath="//div[@class='grid_Square ']")private List<WebElement> products;
		 @FindBy (xpath="//div[@id='pincodeForDeliveryDiv_provide_0']//input[@placeholder='Enter Pincode']")private WebElement pincode;
	 	 
	 	 public naaptolChildBrowserPage(WebDriver driver) {
	     	PageFactory.initElements(driver, this);
	 	}
	
	     public void moveToProduct(WebDriver driver, int index) {
	 		Actions actions = new Actions(driver);
	 		actions.moveToElement(products.get(index));
	 		actions.perform();
	 	     
	        Set<String> handles = driver.getWindowHandles();
		    Iterator<String> i = handles.iterator();
		    {
	        while(i.hasNext()) 
	        {
	        	String handle = i.next();
	        	driver.switchTo().window(handle);
	        	String title = driver.getTitle();
	        	if(title.contains("Buy Rimless"))
	        	{
	        		System.out.println("switchd to buy Rimless");
	        	    break;
	             }
	        	System.out.println("get title");
	        }
	    	}
	     }
	     public void selectdesiredProduct(int index) {
	 		products.get(index).click();
	 	}
	     public void clickHereToBuy() {
	 		clickheretobuy.click();
	 	}
	     public void EnterPinCode() {
	 		pincode.sendKeys("443001");
	 	}
  }
