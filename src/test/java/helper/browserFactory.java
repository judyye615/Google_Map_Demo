package helper;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.lightbody.bmp.BrowserMobProxyServer;
 
public class browserFactory {
 
   static WebDriver driver;
   public BrowserMobProxyServer proxy;
 
   public static WebDriver StartBrowser(String browserName, String url) throws InterruptedException {
 
       // Windows User should add .exe after geckodriver
       if (browserName.equalsIgnoreCase("Firefox")) {
           System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
           
           
           
           
           
           driver = new FirefoxDriver();
           driver.manage().window().maximize();
           Thread.sleep(200);
 
       } // Windows User should add .exe after chromedriver
       else if (browserName.equalsIgnoreCase("Chrome")) {
           System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           Thread.sleep(200);
       }
       driver.get(url);
       return driver;
   }
 
}
