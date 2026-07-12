package packageDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends FirstTestClass {
	
	public void verifyFileuploadByUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement objChoose = driver.findElement(By.id("uploadfile_0"));
		objChoose.sendKeys("C:\\Users\\dell\\Downloads\\sample.pdf");
		
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();
		
		WebElement submitbtn = driver.findElement(By.id("submitbutton"));
		submitbtn.click();
	}
	public void verifyFileuploadByUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pdfbtn = driver.findElement(By.id("pickfiles"));
		pdfbtn.click();
		StringSelection obj = new StringSelection("C:\\Users\\dell\\Downloads\\sample.pdf");
		
		// clipboardilak copy cheyanam aa methord tool kit class lan ullath
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj,null);
		
		Robot r = new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		FileUpload obj = new FileUpload();
		obj.openBrowser();
		//obj.verifyFileuploadByUsingSendKeys();
		try {
			obj.verifyFileuploadByUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
