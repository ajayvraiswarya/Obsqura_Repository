package packageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling extends FirstTestClass {
	
	public void dropdownCommands()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		// select method
		Select obj1 = new Select(dropdown);
		obj1.selectByIndex(1);
		obj1.selectByValue("sql");
		obj1.selectByVisibleText("Python");
	}
	
	public void checkboxCommands()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkbox.click();
		
	}
	public void radiobuttobCommands()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobuttn = driver.findElement(By.xpath("//input[@value=\"purple\"]"));
		radiobuttn.click();
		// is slected is used for checkbox radio burron, to confirm the check is confirmed or not
		System.out.println(radiobuttn.isSelected());
	}

	public static void main(String[] args) {
		
		DropdownHandling obj = new DropdownHandling();
		obj.openBrowser();
		obj.dropdownCommands();
		obj.checkboxCommands();
		obj.radiobuttobCommands();
	}

}

// select cheyan ulla methods
//1) selectByIndex
//2)selectByValue
//3)selectByVisibletext
