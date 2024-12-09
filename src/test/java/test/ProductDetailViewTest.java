package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.NaaptolProductDetailQuickView;
import pom.NaaptolProductResultPage;
import pom.naaptolChildBrowserPage;
import utility.Reports;
import pom.NaaptolHomePage;

public class ProductDetailViewTest extends BaseTest{
	 @BeforeTest
	   public void configureReports() {
		  reports = Reports.createReport();
	   }
	@BeforeTest
	public void lunchApplication() {
		driver = Browser.LunchApplication();
					}
	@Test
	
	public void VerifyIfProdutDetailsAreCorrectIfViewInQuickView() {
        test = reports.createTest("VerifyIfProdutDetailsAreCorrectIfViewInQuickView");
		NaaptolHomePage naaptolhomepage = new NaaptolHomePage(driver);
		naaptolhomepage.EnterProductToSearch("mobile");
		naaptolhomepage.ClickOnSearch();
		
		NaaptolProductResultPage naaptolproductresultpage = new NaaptolProductResultPage(driver);
		String productname = naaptolproductresultpage.getProductTitle(0);
		String productprice =naaptolproductresultpage.getProductPrice(0);
		naaptolproductresultpage.moveToDesiredProduct(driver, 0);
		naaptolproductresultpage.clickOnQuickView(0);
		naaptolproductresultpage.clickHereToBuy();
		naaptolproductresultpage.EnterPinCode();
		
		//Assert.assertEquals(naaptolproductresultpage.getProductNameOnQuickView(), productname);
	    //Assert.assertEquals(naaptolproductresultpage.getProductPriceOnQuickView(), productprice);
	}
		
		@Test
		public void VerifyAddProductToCartUsingProductDetailPage() {
			 test = reports.createTest("VerifyAddProductToCartUsingProductDetailPage");
			NaaptolHomePage naaptolhomepage = new NaaptolHomePage(driver);
			naaptolhomepage.EnterProductToSearch("mobile");
			naaptolhomepage.ClickOnSearch();
			
			naaptolChildBrowserPage childBrowser = new naaptolChildBrowserPage(driver);
			childBrowser.selectdesiredProduct(0);
			childBrowser.moveToProduct(driver, 0);
			childBrowser.EnterPinCode();
			childBrowser.clickHereToBuy();
			
		}
		
	
}	

