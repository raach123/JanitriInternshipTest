package genericUtility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {

	WebDriver driver=null;
	Actions act=null;
	Select s=null;
	/**
	 * this is a generic method for implicit wait
	 * @param particularSeconds
	 */
	public void implicitWait(WebDriver driver,int particularSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
	
	}
	
	/**
	 * this is a generic method for maximize the window
	 */
	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/*----------------Actions class generic functions--------------*/
	/**
	 * this is a generic method to right click on an element
	 */
	
	public void rightClickOnAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.contextClick(element).perform();
				
	}
		
	/**
	 * this is a generic method to drag and drop an element 	
	 */
		
	public void dragAndDropAnElement(WebDriver driver,WebElement src, WebElement target) {
		act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
	}
		
	/**
	 * this is to click on a element
	 * 	
	 */
		
	public void clickOnAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.click(element).perform();
	}
		
	/**
	 * this is a generic method to drag and drop a pointer
	 */
		
	public void dragAPointer(WebDriver driver,WebElement src,int xOffset,int yOffset) {
		act=new Actions(driver);
		act.dragAndDropBy(src, xOffset, yOffset).perform();
	}
		
	/**
	 * this is a generic method to move mouse cursor to a particular element
	 */
		
	public void moveToAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
		
	/**
	 * this is a generic method to hold an element	
	 */
		
	public void holdAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	
	/**
	 * this is a generic method scroll to a particular element
	 */

	public void scrollToAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	/**
	 * this is a generic method to release an element
	 */
	
	public void releaseAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.release(element).perform();
		
	}
	
	/*---------------select class generic functions-------------------*/
	
	/**
	 * this is a generic method to select an option based on index value
	 */
	
	public void selectEleemntByIndex(WebElement element ,int indexNum) {
		s=new Select(element);
		s.selectByIndex(indexNum);
	}
	
	/**
	 * this is a generic method to select an option based on visible text
	 */
	
	public void selectElementByVisibleText(WebElement element, String text) {
		s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	/**
	 * this is a generic method to select an option based on value
	 */
	
	public void selectAnElementByvalue(WebElement element, String value) {
		s=new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * this is a generic method to de-select an option based on index value
	 */
	
	public void deselectEleemntByIndex(WebElement element ,int indexNum) {
		s=new Select(element);
		s.deselectByIndex(indexNum);
	}
	
	/**
	 * this is a generic method to de-select an option based on visible text
	 */
	
	public void deselectElementByVisibleText(WebElement element, String text) {
		s=new Select(element);
		s.deselectByVisibleText(text);
	}
	
	/**
	 * this is a generic method to  de-select an option based on value
	 */
	
	public void deselectAnElementByvalue(WebElement element, String value) {
		s=new Select(element);
		s.deselectByValue(value);
	}
	
	/**
	 * this is a generic method to de-select all the options
	 */
	
	public void deselectAllOptions(WebElement element) {
		s=new Select(element);
		s.deselectAll();
		
	}
	/**
	 * this is a generic method to to fetch all the selected option from multi-selected drop
	 */
	
	public List<WebElement>fetchAllSelectedOptons(WebElement element){
		s=new Select(element);
		List<WebElement>all=s.getAllSelectedOptions();
		return all;
		
	}
	
	/**
	 * this is a method to read all the options
	 */
	
	public List<WebElement> fetchAllOptions(WebElement element){
		s=new Select(element);
		List<WebElement>all=s.getOptions();
		return all;
	}
	
	/*--------------Alert class--------------------*/
	
	/**
	 * this is generic method to accept the alert
	 */
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * this is a method to dismiss the alert

	 *
	 */
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	/*----------------Frame------------------*/
	
	/**
	 * this is a generic method to switch frame based on child index
	 */
	public void switchTochildFrame(int childframeindex) {
		driver.switchTo().frame(childframeindex);
	}
	 
	
	
}
