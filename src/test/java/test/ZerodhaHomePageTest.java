package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaHomePage;
import utility.parameterization;

public class ZerodhaHomePageTest {

	WebDriver driver;
	@BeforeMethod
	public void openbrowser()
	{
      driver=Browser.openBrowser("https://kite.zerodha.com/");

	}
	@Test
	public void validateSerachOption() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaHomePage zerodhahomepage=new ZerodhaHomePage(driver);
		zerodhahomepage.enterUserId(parameterization.getExcelData(0, 0,"credential"));
		zerodhahomepage.enterPassword(parameterization.getExcelData(0, 1,"credential"));
		Thread.sleep(2000);
		zerodhahomepage.clickOnLogin();
		Thread.sleep(1000);
		zerodhahomepage.enterPin(parameterization.getExcelData(0, 2,"credential"));
		zerodhahomepage.clickOnContineous();
		Thread.sleep(1000);
		zerodhahomepage.enterSharesName("Tata");
		
        zerodhahomepage.clickOnSharename(driver);
		Thread.sleep(2000);
		zerodhahomepage.clickOnSelectedbuy();
		zerodhahomepage.clickOnBuy();
		Thread.sleep(2000);
	}

}
