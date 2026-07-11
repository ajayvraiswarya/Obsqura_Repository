package packageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends FirstTestClass {
	
	public void verifyFileuploadByUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement objChoose = driver.findElement(By.id("uploadfile_0"));
		objChoose.sendKeys("C:\\Users\\dell\\Downloads\\pdf-sample_0.pdf\\");
	}

	public static void main(String[] args) {
		

	}

}
