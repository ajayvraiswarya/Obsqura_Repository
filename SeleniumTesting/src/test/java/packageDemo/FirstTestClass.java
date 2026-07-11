package packageDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {
	
	public WebDriver driver;
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

	public static void main(String[] args) {
		
		FirstTestClass obj = new FirstTestClass();
		obj.openBrowser();
		obj.closeBrowser();

	}

}
