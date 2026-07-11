package packageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends FirstTestClass {
	
	public void webElement() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textbox = driver.findElement(By.id("single-input-field"));
		textbox.sendKeys("AjabABC");
		WebElement msgbtn = driver.findElement(By.id("button-one"));
		// is displayed we can use whatever webelements
		System.out.println(msgbtn.isDisplayed());
		
		// is enabled used with button
		System.out.println(msgbtn.isEnabled());
		msgbtn.click();
		WebElement messageshow = driver.findElement(By.id("message-one"));
		System.out.println(messageshow.getText());
		System.out.println(msgbtn.getTagName());
		System.out.println(msgbtn.getCssValue("background-color"));
		// clear the value provided in textboc
		textbox.clear();
		
	}

	public static void main(String[] args) {
		
		WebElementCommands obj = new WebElementCommands();
		obj.openBrowser();
		obj.webElement();
		//obj.closeBrowser();

	}

}
