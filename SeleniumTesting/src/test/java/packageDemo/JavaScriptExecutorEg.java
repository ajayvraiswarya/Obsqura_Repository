package packageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorEg extends FirstTestClass {

	public void javascriptAction()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");

	    WebElement showMessageButton =
	        driver.findElement(By.xpath("//button[@id='button-one']"));
	    // using for scroll purpose
	    JavascriptExecutor js = (JavascriptExecutor) driver; // driver casting
	    js.executeScript("arguments[0].click();", showMessageButton);
	    js.executeScript("window.scrollBy(0,350)",""); //0- x axis ,350 - Y axis
	    // positive value = scroll down , negative = scroll up
	    // scroll to totalil nin an value kurayunnath
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecutorEg obj = new JavaScriptExecutorEg();
		obj.openBrowser();
		obj.javascriptAction();

	}

}
