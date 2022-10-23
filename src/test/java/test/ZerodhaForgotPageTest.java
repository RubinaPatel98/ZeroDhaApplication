package test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaForgotePage;
import utility.Listeners;
public class ZerodhaForgotPageTest {

	WebDriver driver;
	
	@BeforeMethod
	public void openbrowser()
	{
      driver=Browser.openBrowser("https://kite.zerodha.com/");

	}
	@Test
	public void validateByForgotIdByEmail() throws InterruptedException
	{
		ZerodhaForgotePage zerodhaforgotpage=new ZerodhaForgotePage(driver);
		zerodhaforgotpage.clickOnForgotPin();
		Thread.sleep(3000);
		zerodhaforgotpage.clickOnForgotId();
		Thread.sleep(4000);
		zerodhaforgotpage.enterPan("123456789");
		zerodhaforgotpage.clickOnemail();
		zerodhaforgotpage.enterEmail("rubinaPatel@gmail.com");
	}
	
	@Test
   public void validateByRememeberId() throws InterruptedException 
   {
	   ZerodhaForgotePage zerodhaforgotpage=new ZerodhaForgotePage(driver);
		zerodhaforgotpage.clickOnForgotPin();
		Thread.sleep(3000);
		zerodhaforgotpage.clickOnIRemember();
		Thread.sleep(2000);
		zerodhaforgotpage.enterUserid("123456");
		zerodhaforgotpage.enterPan("45678954");
		zerodhaforgotpage.clickOnsms();
		zerodhaforgotpage.enterMobileNo("4568798745");
	   
   }
}
