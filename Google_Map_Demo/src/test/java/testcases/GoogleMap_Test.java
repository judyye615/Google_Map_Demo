package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import helper.BaseClass;
import pages.GoogleMap;

public class GoogleMap_Test extends BaseClass{
	
	GoogleMap googleMap;
	
    
@Test(priority = 0, description = "move the map pin A")    
public void move_Map_Pin() throws InterruptedException{


           driver.switchTo().frame(0);

           WebElement map_pin_A = driver.findElement(By.xpath("//*[@id='map']/div/div/div[2]/div[2]/div/div[3]/div[1]/img"));

           WebElement dropHere = driver.findElement(By.xpath("//*[@id='map']/div/div/div[2]/div[2]/div/div[3]/div[2]/img"));


//         int targetEleXOffset = dropHere.getLocation().getX();
//         int targetEleYOffset = dropHere.getLocation().getY();

             Actions action = new Actions(driver);

             int xOffset = dropHere.getLocation().getX();
             int yOffset = dropHere.getLocation().getY();

             int x = xOffset * -1;
             int y = yOffset * -1;
             
             int target = x + y;

             
         try {
                  action.moveToElement(map_pin_A).build().perform();
           } catch (Exception e) {
                  action.moveToElement(map_pin_A).build().perform();
           }

             Thread.sleep(200);

             action.moveToElement(map_pin_A).build().perform(); //sometime unable to locate
             Thread.sleep(200);

             action.clickAndHold(map_pin_A).build().perform();
             Thread.sleep(300);
             
             action.dragAndDrop(map_pin_A, dropHere).release().build().perform();

             
 }

}