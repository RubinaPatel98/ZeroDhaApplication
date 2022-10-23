package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {

	@FindBy (xpath="//img[@alt=\"Zerodha logo\"]")private WebElement logo;
	@FindBy (xpath="//a[text()='About']")private WebElement about;
    @FindBy (xpath="(//a[text()='Products'])[1]")private WebElement products;
    @FindBy (xpath="(//a[text()='Pricing'])[1]")private WebElement price;
    @FindBy (xpath="(//a[text()='Support'])[1]")private WebElement support;
    @FindBy (xpath="//li[@id=\"navbar_menu\"]")private WebElement menu;
    @FindBy (xpath="//input[@id=\"user_mobile\"]")private WebElement mobno;
    @FindBy (xpath="//button[@type=\"submit\"]")private WebElement contineuss;
    @FindBy (xpath="//a[text()='Want to open an NRI account?']")private WebElement NRIAccount;
    @FindBy (xpath="//a[text()='Sign up now']")private WebElement signup;
    @FindBy (xpath="//a[text()='Sign up now']")private WebElement sign;



         public ZerodhaSignUpPage(WebDriver driver)
           {
        	 PageFactory.initElements(driver,this);
	        }
         
         public void clickOnLogo()
         {
        	 logo.click();
         }
         public void enterMobNo(String mob)
         {
        	 mobno.sendKeys(mob);
         }
         public void clickOnContineous()
         {
        	 contineuss.click();
         }
         public void clickOnCreateNRIAccount()
         {
        	 NRIAccount.click();
         }
         public void clickOnSignup()
         {
        	 signup.click();
         }
         public void clickOnAboutUs()
         {
        	 about.click();
         }
         public void clickOnPrice(WebDriver driver)
         {
        	 price.click();
        	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",sign);
         }
         
}
