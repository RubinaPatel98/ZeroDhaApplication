package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {

	@FindBy (xpath="//input[@id='userid']")private WebElement userid;
	@FindBy (xpath="//input[@id='password']")private WebElement pass;
	@FindBy (xpath="//button[@type='submit']")private WebElement login;
    @FindBy (xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
    @FindBy (xpath="//input[@type='password']")private WebElement pin ;
    @FindBy (xpath="//button[@type=\"submit\"]")private WebElement contineus ;
    @FindBy (xpath="//a[text()='Problem with PIN?']")private WebElement forgotPin ;
    @FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement create;
   public ZerodhaLoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void  enterUserId(String Userid)
   {
	   userid.sendKeys(Userid);
   }
   
   public void enterPassword(String password)
   {
	   pass.sendKeys(password);
   }
   
   public void clickOnLogin()
   {
	   login.click();
   }
   
   public void clickOnForgotPassword(WebDriver driver)
   {
	   forgot.click();
	   String title=driver.getTitle();
		System.out.println(title);
		
   }
   
   public void enterPin(String Pin)
   {
	   pin.sendKeys(Pin);
   }
   
   public void clickOnContineous()
   {
	   contineus.click();
   }
   public void clickOnForgotPin()
   {
	   forgotPin.click();
   }
   public void clickOnSignIn(WebDriver driver)
   {
	   create.click();
	   Set<String> handles=driver.getWindowHandles();
		Iterator<String>i=handles.iterator();
		System.out.println(i.next());

		while(i.hasNext())
		{
			String handle=i.next();
			driver.switchTo().window(handle);
			String Actualtitle=driver.getTitle();
			if(Actualtitle.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha\r\n"))
			
			{
				System.out.println("    ...............You are in signin page");
			}
		}


   }
}
