package packageDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleFrames extends FirstTestClass {

	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		// finding total no of frames(count)
		List<WebElement> frme_count = driver.findElements(By.tagName("iframe"));
		System.out.println("Total count " + frme_count.size());
		
		WebElement frameone = driver.findElement(By.id("frame1"));
		// giving control to this frame
		driver.switchTo().frame(frameone);
		WebElement frame_heading = driver.findElement(By.id("sampleHeading"));
		System.out.println("Frame Heading" + frame_heading.getText());
		
		// moving back to 
		driver.switchTo().defaultContent();
	}
	public static void main(String[] args) {
		
		HandleFrames obj = new HandleFrames();
		obj.openBrowser();
		obj.verifyFrames();

	}

}
