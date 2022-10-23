package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BataLogopage {

	@FindBy (xpath="//a[@title=\"Bata Home\"]")private WebElement logo;
	@FindBy (xpath="//span[@class=\"cc-headerBar-label\"]")private WebElement menu;
	@FindBy (xpath="//button[@class=\"cc-headerBar-search js-headerSearchButton \"]")private WebElement search;
	@FindBy (xpath="//a[@class=\"cc-headerBar-link trackLink\"]")private WebElement ordertarck;
	@FindBy (xpath="//div[@id=\"minicartIcon\"]")private WebElement $$;
	@FindBy (xpath="(//a[@class=\"cc-item-link\"])[1]")private WebElement store;
	@FindBy (xpath="(//a[@class=\"cc-item-link\"])[2]")private WebElement contact;
	@FindBy (xpath="(//a[@class=\"cc-item-link\"])[3]")private WebElement newseleter;
	@FindBy (xpath="(//a[@class=\"cc-item-link\"])[4]")private WebElement bataclub;
	@FindBy (xpath="//h2[text()='Check order']")private WebElement checkOrder ;
	@FindBy (xpath="//input[@id=\"trackorder-form-number\"]")private WebElement orderno;
	@FindBy (xpath="//input[@id=\"trackorder-form-email\"]")private WebElement email;


	public BataLogopage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void checkLogo()
	{
	
	}
}
