package packageDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends FirstTestClass {
	
	public void simpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement click1 = driver.findElement(By.id("alertButton"));
		click1.click();
		// driver nte controll particular alertilak varan
		Alert objalert = driver.switchTo().alert();
		// for using ok
		objalert.accept();
	}
	
	public void confirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement click2 = driver.findElement(By.id("confirmButton"));
		click2.click();
		Alert objalert = driver.switchTo().alert();
		// for using cancel dismiss used
		objalert.dismiss();	
	}
	public void promptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement click3 = driver.findElement(By.id("promtButton"));
		click3.click();
		Alert objalert = driver.switchTo().alert();
		objalert.sendKeys("ajay");
		objalert.accept();
	}

	public static void main(String[] args) {
		
		AlertHandling obj = new AlertHandling();
		obj.openBrowser();
		//obj.simpleAlert();
		//obj.confirmAlert();
		obj.promptAlert();

	}

}
