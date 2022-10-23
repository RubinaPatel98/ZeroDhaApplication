package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSignUpPage;
import utility.ExtendReport;
import utility.Screenshot;
import utility.ZerodhaPageElements;
import utility.parameterization;
@Listeners(utility.Listeners.class)
public class ZerodhaLoginPageTest extends ZerodhaPageElements{

	ExtentReports  reports;
	ExtentTest test;
	
	@BeforeTest
	public void createReports() {
		reports= ExtendReport.getReports();
	}
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void openbrowser()
	{
      driver=Browser.openBrowser("https://kite.zerodha.com/");

	}
	
	@Test(priority=1)
	public void validateZerodhaLoginPage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		test= reports.createTest("validateZerodhaLoginPage");
		ZerodhaLoginPage zerodhaLoginpage= new ZerodhaLoginPage(driver);
		zerodhaLoginpage.enterUserId(parameterization.getExcelData(0, 0,"credential"));
		zerodhaLoginpage.enterPassword(parameterization.getExcelData(0, 1,"credential"));
		Thread.sleep(1000);
		zerodhaLoginpage.clickOnLogin();
		Thread.sleep(1000);
		zerodhaLoginpage.enterPin(parameterization.getExcelData(0, 2,"credential"));
		zerodhaLoginpage.clickOnContineous();
	}
	
	@Test(priority=0)
	public void validateForgotPage()
	{
		test=reports.createTest("validateForgotPage");
		ZerodhaLoginPage zerodhaLoginpage= new ZerodhaLoginPage(driver);
		zerodhaLoginpage.clickOnForgotPassword(driver);
		
	}
	@Test(priority=-1)
	public void validateCreatePage() throws InterruptedException
	{
		test=reports.createTest("validateCreatePage");
		ZerodhaLoginPage zerodhaLoginpage= new ZerodhaLoginPage(driver);
		zerodhaLoginpage.clickOnSignIn(driver);
		Thread.sleep(1000);
		
		
			}
	@Test
	public void validateSignUpPage() 
	{
		test=reports.createTest("validateSignUpPage");
		WebDriver driver=Browser.openBrowser("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account");
		ZerodhaSignUpPage zerodhaSignUpPage= new ZerodhaSignUpPage(driver);
		zerodhaSignUpPage.clickOnLogo();
		zerodhaSignUpPage.clickOnSignup();
		zerodhaSignUpPage.enterMobNo("7895875478");
		zerodhaSignUpPage.clickOnContineous();
		zerodhaSignUpPage.clickOnCreateNRIAccount();
		zerodhaSignUpPage.clickOnAboutUs();
		
	}
	@Test
	public void validatePricingPage()
	{
		test=reports.createTest("validatePricingPage");
		WebDriver driver=Browser.openBrowser("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account");
		ZerodhaSignUpPage zerodhaSignUpPage= new ZerodhaSignUpPage(driver);
		zerodhaSignUpPage.clickOnPrice(driver);
		
	}
	//@AfterMethod()
	/*public void screenshot() throws IOException
	{
		Screenshot.TakeScreenshot(driver, "Zerodha");
	}
	*/
	@AfterMethod()
	public void captureResults(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, result.getName());
		}
	}
	
	@AfterTest
	public void flashResults()
	{
		reports.flush();
	}
}
