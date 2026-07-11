package packageDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends FirstTestClass {

	public void verifyRighclick()
	{
		WebElement others = driver.findElement(By.id("others"));
		// All the methods of mouse actions are inside actions class
		Actions objaction = new Actions(driver);
		// All mouse actions need build().perform()
		objaction.contextClick(others).build().perform();
	}
	public void verifyMousehover()
	{
		WebElement others = driver.findElement(By.id("others"));
		Actions objaction = new Actions(driver);
		objaction.moveToElement(others).build().perform();
	}
	public void verifyDoubleClick()
	{
		WebElement others = driver.findElement(By.id("others"));
		Actions objaction = new Actions(driver);
		objaction.doubleClick(others).build().perform();
	}
	public void verifyDragDrop()
	{
		WebElement others = driver.findElement(By.id("others"));
		others.click();
		WebElement item1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drag1 = driver.findElement(By.id("mydropzone"));
		Actions objaction = new Actions(driver);
		objaction.dragAndDrop(item1, drag1).build().perform();
	}
	/// keyboard actions
	public void verifyKeyboardAction() throws AWTException 
	{
		Robot objrob = new Robot();
		objrob.keyPress(KeyEvent.VK_CONTROL);
		objrob.keyPress(KeyEvent.VK_T);
		objrob.keyRelease(KeyEvent.VK_CONTROL);
		objrob.keyRelease(KeyEvent.VK_T);
	}
	public static void main(String[] args) {
		
		HandlingActions obj = new HandlingActions();
		obj.openBrowser();
		//obj.verifyRighclick();
		//obj.verifyMousehover();
		//obj.verifyDoubleClick();
		//obj.verifyDragDrop();
		try {
			obj.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
