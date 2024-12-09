package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.NaaptolCartPage;
import pom.NaaptolHomePage;
import pom.NaaptolProductResultPage;
import utility.Reports;

public class AddProductToCart extends BaseTest{
	 @BeforeTest
	   public void configureReports() {
		  reports = Reports.createReport();
	   }
	@BeforeMethod
	public void lunchApplication() {
		driver = Browser.LunchApplication();
					}
	
	@Test
	
	public void verifyAddproductToCartUsingProductDetailPage() {
		test = reports.createTest("verifyAddproductToCartUsingProductDetailPage");
		NaaptolHomePage naaptolhomepage = new NaaptolHomePage(driver);
		naaptolhomepage.EnterProductToSearch("mobile");
		naaptolhomepage.ClickOnSearch();
		
		NaaptolProductResultPage naaptolproductresultpage = new NaaptolProductResultPage(driver);
		naaptolproductresultpage.selectdesiredProduct(0);
		switchToChildBrowser();
		naaptolproductresultpage.EnterPinCode();
		naaptolproductresultpage.clickHereToBuy();
		naaptolproductresultpage.ClickOnProceedToCheckOut();
		
		}
	@Test
	public void verifyAddingMultipleProductToCart() {
		 test = reports.createTest("verifyAddingMultipleProductToCart");
		
		NaaptolHomePage naaptolhomepage = new NaaptolHomePage(driver);
		naaptolhomepage.EnterProductToSearch("mobile");
		naaptolhomepage.ClickOnSearch();
		
		NaaptolProductResultPage naaptolproductresultpage = new NaaptolProductResultPage(driver);
		naaptolproductresultpage.selectdesiredProduct(1);
		switchToChildBrowser();
		naaptolproductresultpage.EnterPinCode();
		naaptolproductresultpage.clickHereToBuy();
		
	}
	@Test
	public void VerifyRemoveAproductFromCartList() {
		 test = reports.createTest("VerifyRemoveAproductFromCartList");
		NaaptolHomePage naaptolhomepage = new NaaptolHomePage(driver);
		naaptolhomepage.EnterProductToSearch("mobile");
		naaptolhomepage.ClickOnSearch();
		
		NaaptolProductResultPage naaptolproductresultpage = new NaaptolProductResultPage(driver);
		naaptolproductresultpage.selectdesiredProduct(0);
		switchToChildBrowser();
		naaptolproductresultpage.clickHereToBuy();
		naaptolproductresultpage.EnterPinCode();
		NaaptolCartPage cart = new NaaptolCartPage(driver);
		cart.verifyRemoveProductFromCart();
		
	}
	}


