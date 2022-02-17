package helper;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class browserFactory {
 
   static WebDriver driver;
 
   public static WebDriver StartBrowser(String browserName, String url) {
 
       // Windows User should add .exe after geckodriver
       if (browserName.equalsIgnoreCase("Firefox")) {
           System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
           driver = new FirefoxDriver();
           driver.manage().window().maximize();
 
       } // Windows User should add .exe after chromedriver
       else if (browserName.equalsIgnoreCase("Chrome")) {
           System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
       }
       driver.get(url);
       return driver;
   }
 
}
