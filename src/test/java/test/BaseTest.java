package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pom.NaaptolProductResultPage;
import pom.NaaptolHomePage;


public class BaseTest {
	public static WebDriver driver;
	public NaaptolHomePage naaptolHomePage;
	public NaaptolProductResultPage naaptoleproductresultpage;
	public ProductDetailViewTest productdetailfromquickview;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	public void switchToChildBrowser() {
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		driver.switchTo().window(i.next());
		driver.switchTo().window(i.next());
	}

}
