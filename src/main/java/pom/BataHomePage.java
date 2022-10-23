package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BataHomePage {

	@FindBy (xpath="//a[@id=\"IN_SneakerStudio\"]")private WebElement Studio;
	@FindBy (xpath="//a[@id=\"IN_New\"]")private WebElement newone;
	@FindBy (xpath="//a[@id=\"IN_Women\"]")private WebElement women;
	@FindBy (xpath="//a[@id=\"IN_Kids\"]")private WebElement kids;
	@FindBy (xpath="//a[@id=\"IN_Sale\"]")private WebElement sale;
	@FindBy (xpath="//a[@id=\"IN_Brand\"]")private WebElement brand;
	@FindBy (xpath="//input[@id=\"search-input-top-bar\"]")private WebElement Searchtab;
	@FindBy (xpath="//button[@name=\"search-button\"]")private WebElement search;
	@FindBy (xpath="(//a[@id=\"IN_SneakerStudio_Men\"])[2]")private WebElement showall;
	
	public BataHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void MoveOnStudio(WebDriver driver)
	{
		Actions a=new Actions (driver);
		a.moveToElement(Studio);
		a.perform();
	}
	
	public void MoveToNew(WebDriver driver)
	{
		Actions a=new Actions (driver);
		a.moveToElement(newone);
		a.perform();
	
	}
	public void MoveToWomen(WebDriver driver)
	{
		Actions a=new Actions (driver);
		a.moveToElement(women);
		a.perform();
	
	}
	public void MoveToSerachtab(WebDriver driver)
	{
		Actions a=new Actions (driver);
		a.moveToElement(Searchtab);
		a.perform();
		Searchtab.sendKeys("Shoes");
	
	}
	public void clickOnShowall()
	{
		
		showall.click();
	}

}
