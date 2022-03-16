package helper;
 
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class utility {
 
   public static WebElement waitForElement(WebDriver driver, WebElement element) {
 
       // Created a wait object for 10 seconds wait
       WebDriverWait wait = new WebDriverWait(driver, 10);
 
       // waiting for webelement to be visible
       wait.until(ExpectedConditions.visibilityOf(element));
       // waiting for webelement to be clickable
       wait.until(ExpectedConditions.elementToBeClickable(element));
 
       return element;
   }
 
   public static void validateMessage(WebElement element, String msg) {
       Assert.assertEquals(element.getText(), msg);
   }
 
   public static void validateTitle(WebDriver driver, String title) {
 
       // Waits 10 seconds, then validates the driver has correct website title
       boolean status = new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains(title));
       Assert.assertTrue(status);
   }
 
   public static void acceptAlert(WebDriver driver) {
 
       // Wait for 10 seconds for the alert to pop-up and if it's present accept the alert
       new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent()).accept();
   }
 
   public static void dismissAlert(WebDriver driver) {
 
       // Wait for 10 seconds for the alert to pop-up and if it's present dismiss the alert
       new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent()).dismiss();
   }
 
   public static String captureScreenshot(WebDriver driver) {
 
       String time = getTime();
 
       // destination to save the screenshot as MVN{time}.png
       String destination = System.getProperty("user.dir") + "/screenshots/MVN" + time + ".png";
 
       File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 
       try {
           FileHandler.copy(src, new File(destination));
       } catch (IOException e) {
           System.out.println("Screenshot Failed: " + e.getMessage());
       }
 
       return destination;
   }
 
   public static String getTime() {
       DateFormat dateformat = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
       return dateformat.format(new Date());
   }
 
}
