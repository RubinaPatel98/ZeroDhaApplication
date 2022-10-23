package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static  WebDriver openBrowser(String url)
	{
          System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        // WebDriverManager.chromedriver().setup();
        // ChromeOptions options= new ChromeOptions();
       //  options.addArguments("--disable-notifications");
        // options.addArguments("headless");
         
		WebDriver driver=new ChromeDriver();
          driver.navigate().to(url);
          driver.manage().window().maximize();
          return driver;
		
	}
}
