package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {

	@FindBy (xpath="//input[@id='userid']")private WebElement userid;
	@FindBy (xpath="//input[@id='password']")private WebElement pass;
	@FindBy (xpath="//button[@type='submit']")private WebElement login;
    @FindBy (xpath="//input[@type='password']")private WebElement pin ;
    @FindBy (xpath="//button[@type=\"submit\"]")private WebElement contineus ;
    @FindBy (xpath="//input[@placeholder=\"Search eg: infy bse, nifty fut, nifty weekly, gold mcx\"]")private WebElement searchtab ;
    @FindBy (xpath="(//span[@class=\"tradingsymbol\"])[1]")private WebElement tatacoffee;
    @FindBy (xpath="//button[@class=\"button-blue buy\"]")private WebElement buy;
    @FindBy (xpath="//button[@class=\"button-orange sell\"]")private WebElement sell;
    @FindBy (xpath="(//button[@class=\"button-outline\"])[1]")private WebElement marketDepth;
    @FindBy (xpath="(//button[@class=\"button-outline\"])[2]")private WebElement chart;
    @FindBy (xpath="(//button[@class=\"button-outline\"])[3]")private WebElement delete;
    @FindBy (xpath="//span[@class=\"icon icon-ellipsis\"]")private WebElement more;
    @FindBy(xpath="(//button[@class=\"button-blue\"])[1]")private WebElement Buy1;
    @FindBy(xpath="(//button[@class=\"button-blue\"])[2]")private WebElement Sell1;
    @FindBy(xpath="//span[@class=\"icon icon-trending-up\"]")private WebElement chart1;
    @FindBy(xpath="//button[@class=\"button-outline\"]")private WebElement marketDepth1 ;
    @FindBy(xpath="//button[@data-balloon=\"Added\"]")private WebElement added ;
  
    
public ZerodhaHomePage(WebDriver driver)
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
     public void enterPin(String Pin)
    {
 	   pin.sendKeys(Pin);
    }
    
    public void clickOnContineous()
    {
 	   contineus.click();
    }
    public void enterSharesName(String sname)
    {
    	searchtab.sendKeys(sname);
    }
  
   public void clickOnSharename(WebDriver driver)
   {
	   
	   Actions a=new Actions(driver);
	   a.moveToElement(Buy1);
	   a.perform();
   
   }
    public void clickOnsell()
    {
    	sell.click();
    }
    public void clickOnBuy()
    {
    	buy.click();
    }
    public void clickOnMarketDept()
    {
    	marketDepth.click();
    }
    public void clickOnchart()
    {
    	chart.click();
    }
    public void clickOndelete()
    {
    	delete.click();
    }
    public void clickOnMore()
    {
    	more.click();
    }
    public void clickOnSelectedbuy()
    {
    	Buy1.click();
    }
    public void clickOnSelecetdSell()
    {
    	Sell1.click();
    }
    public void clickOnChart()
    {
    	chart1.click();
    }
    public void clickOnMarketDepth1()
    {
    	marketDepth1.click();
    }
    public void clickOnAdded()
    {
    	added.click();
    }
}
