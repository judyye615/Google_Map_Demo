package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import helper.utility;

public class GoogleMap {
    

    public WebDriver driver;
 

// Constructor
    public GoogleMap(WebDriver driver) {

       this.driver = driver;
    }

// Locator

       @FindBy(xpath = "//*[@id='map']/div/div/div[2]/div[2]/div/div[3]/div[1]/img")
       WebElement map_Pin_A;

       @FindBy(id = "gmimap1")
       WebElement map_Pin_B;

       @FindBy(id = "gmimap2")
       WebElement map_Pin_C;

       @FindBy(id = "gmimap3")
       WebElement map_Pin_D;

       
  //try to write methods but failed	
       public void clickAndHold(WebElement e) {

    	   Actions actions = new Actions(driver);
    	   actions.clickAndHold(e).release().build().perform(); 	   
	}
     
       public void dragAndDrop(WebElement e, int x, int y) {

    	   Actions actions = new Actions(driver);
    	   actions.dragAndDropBy(e, x, y).release().build().perform();
    	   
	}    
       
}
