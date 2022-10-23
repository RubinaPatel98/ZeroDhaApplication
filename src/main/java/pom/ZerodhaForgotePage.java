package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotePage {

    @FindBy (xpath="//a[text()=\"Forgot user ID or password?\"]")private WebElement forgotid ;
    @FindBy (xpath="(//label[@class=\"su-radio-label\"])[2]")private WebElement forgotMyId;
    @FindBy (xpath="(//label[@class=\"su-radio-label\"])[1]")private WebElement IRememberMyId ;
    @FindBy (xpath="//input[@placeholder=\"PAN\"]")private WebElement pan;
    @FindBy (xpath="//label[text()='E-mail']")private WebElement email;
    @FindBy (xpath="//label[text()='SMS']")private WebElement sms;
    @FindBy (xpath="//input[@placeholder=\"Mobile number (as on account)\"]")private WebElement mobno;
    @FindBy (xpath="//button[@type=\"submit\"]")private WebElement resend;
    @FindBy (xpath="//a[@class=\"text-xsmall text-light reset-account-button\"]")private WebElement backtologin;
    @FindBy (xpath="//input[@placeholder=\"User ID\"]")private WebElement userid;
  @FindBy (xpath="//input[@placeholder=\"E-mail (as on account)\"]")WebElement emailid;
    
    
    public ZerodhaForgotePage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
	   
   }
   public void clickOnForgotPin()
   {
	   forgotid.click();
   }
   
   public void clickOnForgotId()
   {
	   forgotMyId.click();
   }
   
   public void clickOnIRemember()
   {
	   IRememberMyId.click();
   }
   public void enterPan(String Pan)
   {
	   pan.sendKeys(Pan);
   }
   public void clickOnemail()
   {
	   email.click();
   }
   public void clickOnsms()
   {
	   sms.click();
   }
   public void enterMobileNo(String mobNo)
   {
	   mobno.sendKeys(mobNo);
   }
   public void clickOnResend()
   {
	   resend.click();
   }
   public void clickOnBackToLogin()
   {
	   backtologin.click();  
   }
   public void enterUserid(String USerid)
   {
	   userid.sendKeys(USerid);
   }
   public void enterEmail(String Email)
   {
	   emailid.sendKeys(Email);
   }
}

