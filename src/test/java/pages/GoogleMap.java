package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import helper.BaseClass;
import helper.utility;

public class GoogleMap extends BaseClass {

	public WebDriver driver;

	// Constructor
	public GoogleMap(WebDriver driver) {

		this.driver = driver;
	}

	// Locators of Map Pins

	@FindBy(xpath = "//*[@usemap='#gmimap0']")
	WebElement map_Pin_A;
	
	@FindBy(xpath = "//*[@tabindex='-1']/../div[2]/img")
	WebElement map_Pin_A2;

	
	
	@FindBy(xpath = "//*[contains(@aria-label,'change')]/..//div[last()-3]/img")
	WebElement map_Pin_B;
	
	@FindBy(xpath = "//*[@usemap='#gmimap1']")
	WebElement map_Pin_B1;	
	
	@FindBy(xpath = "//*[contains(@aria-label,'change')]/..//div[last()-2]/img")
	WebElement map_Pin_B2;

	
	
	@FindBy(xpath = "//*[contains(@aria-label,'change')]/..//div[last()-1]/img")
	WebElement map_Pin_C;
	

	@FindBy(xpath = "//*[contains(@aria-label,'change')]/..//div[last()]/img")
	WebElement map_Pin_D;

	
	// Locators of Zoom buttons

	@FindBy(xpath = "//*[@title='Zoom out']")
	WebElement zoomOut;

	@FindBy(xpath = "//*[@title='Zoom in']")
	WebElement zoomIn;



	// Behaviors on map_Pin_A
	public void moveToElement_A() {

		Actions action = new Actions(driver);
		action.moveToElement(map_Pin_A).build().perform();

	}

	public void clickAndHold_A() {

		Actions action = new Actions(driver);
		action.clickAndHold(map_Pin_A).release().build().perform();

	}

	public void dragAndDrop_A(int x, int y) {

		Actions action = new Actions(driver);
		action.dragAndDropBy(map_Pin_A, x, y).release().build().perform();
	}

	
	public void moveToElement_A2() {

		Actions action = new Actions(driver);
		action.moveToElement(map_Pin_A2).build().perform();

	}

	public void clickAndHold_A2() {

		Actions action = new Actions(driver);
		action.clickAndHold(map_Pin_A2).release().build().perform();

	}

	public void dragAndDrop_A2(int x, int y) {

		Actions action = new Actions(driver);
		action.dragAndDropBy(map_Pin_A2, x, y).release().build().perform();
	}

	
	
	// Behavior on map_Pin_B
	public void moveToElement_B() {

		Actions action = new Actions(driver);
		action.moveToElement(map_Pin_B).build().perform();

	}

	public void clickAndHold_B() {

		Actions action = new Actions(driver);
		action.clickAndHold(map_Pin_B).release().build().perform();

	}

	public void dragAndDrop_B(int x, int y) {

		Actions action = new Actions(driver);
		action.dragAndDropBy(map_Pin_B, x, y).release().build().perform();

	}
	
	
	
	// Behavior on map_Pin_B1
	public void moveToElement_B1() {

		Actions action = new Actions(driver);
		action.moveToElement(map_Pin_B1).build().perform();

	}

	public void clickAndHold_B1() {

		Actions action = new Actions(driver);
		action.clickAndHold(map_Pin_B1).release().build().perform();

	}

	public void dragAndDrop_B1(int x, int y) {

		Actions action = new Actions(driver);
		action.dragAndDropBy(map_Pin_B1, x, y).release().build().perform();

	}
	
	public void moveToElement_B2() {

		Actions action = new Actions(driver);
		action.moveToElement(map_Pin_B2).build().perform();

	}

	public void clickAndHold_B2() {

		Actions action = new Actions(driver);
		action.clickAndHold(map_Pin_B2).release().build().perform();

	}

	public void dragAndDrop_B2( int x, int y) {

		Actions action = new Actions(driver);
		action.dragAndDropBy(map_Pin_B2, x, y).release().build().perform();
	}

	
	
	// Behavior on map_Pin_C
	public void moveToElement_C() {

		Actions action = new Actions(driver);
		action.moveToElement(map_Pin_C).build().perform();

	}

	public void clickAndHold_C() {

		Actions action = new Actions(driver);
		action.clickAndHold(map_Pin_C).release().build().perform();

	}

	public void dragAndDrop_C(int x, int y) {

		Actions action = new Actions(driver);
		action.dragAndDropBy(map_Pin_C, x, y).pause(500).release().build().perform();

	}

	
	
	// Behavior on map_Pin_D
	public void moveToElement_D() {

		Actions action = new Actions(driver);
		action.moveToElement(map_Pin_D).build().perform();

	}

	public void clickAndHold_D() {

		Actions action = new Actions(driver);
		action.clickAndHold(map_Pin_D).pause(100).release().build().perform();

	}

	public void dragAndDrop_D(int x, int y) {

		Actions action = new Actions(driver);
		action.dragAndDropBy(map_Pin_D, x, y).pause(100).release().build().perform();

	}
	
	
	
	

	public void click_ZoomIn_Button() {
		utility.waitForElement(driver, zoomIn).click();
		System.out.println("LOG INFO: CLicked on Zoom In Button");
	}

	public void click_ZoomOut_Button() {
		utility.waitForElement(driver, zoomOut).click();
		System.out.println("LOG INFO: Clicked on Zoom Out Button");
	}

}
