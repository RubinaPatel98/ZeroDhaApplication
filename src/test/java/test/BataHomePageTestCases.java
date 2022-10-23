package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.BataHomePage;

public class BataHomePageTestCases {

	WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser()
	{
		driver=Browser.openBrowser("https://www.bata.in/search?q=&search-button=&lang=en_IN");
	}
	
	@Test
	public void ValidateHomePage() throws InterruptedException 
	{
		BataHomePage batahomepage=new BataHomePage(driver);
		batahomepage.MoveOnStudio(driver);
		batahomepage.MoveToNew(driver);
		batahomepage.MoveToWomen(driver);
		//batahomepage.MoveToSerachtab(driver);
		//Thread.sleep(4000);
	//	batahomepage.MoveOnStudio(driver);
	//	batahomepage.clickOnShowall();

	}
	
	
}
