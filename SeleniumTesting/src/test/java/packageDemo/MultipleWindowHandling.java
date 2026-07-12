package packageDemo;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v123.browser.model.WindowID;

public class MultipleWindowHandling extends FirstTestClass{

	public void verifyMultipleWindowHandling()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentId = driver.getWindowHandle();
		
		WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		
		Set<String> handleIds = driver.getWindowHandles();
		Iterator<String> itr = handleIds.iterator();
		// getting child window handle
		while(itr.hasNext())
		{
			String handid = itr.next();
			// 2 ids m different an so athkond switch cheyunu
			if (!handid.equals(parentId))
			{
				driver.switchTo().window(handid);
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("ajay@gmail.com");
				WebElement submtBtn = driver.findElement(By.xpath("//input[@type='submit']"));
				submtBtn.click();
			}
		}
	}
	public static void main(String[] args) {

		MultipleWindowHandling obj = new MultipleWindowHandling();
		obj.openBrowser();
		obj.verifyMultipleWindowHandling();
	}

}
