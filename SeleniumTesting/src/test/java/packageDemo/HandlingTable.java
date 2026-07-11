package packageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends FirstTestClass {

	public void verifyTables()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		// fetching entire table
		WebElement entreTable = driver.findElement(By.id("dtBasicExample"));
		System.out.println(entreTable.getText());
		// fetching heading
		WebElement theading = driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]/thead/tr[1]"));
		System.out.println( );
		System.out.println(theading.getText());
		// fetching table content
		WebElement tfirrow = driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr[1]"));
		System.out.println( );
		System.out.println(tfirrow.getText());
		// fetching one column data
		WebElement tfirsColmn = driver.findElement(By.xpath("//table[@id=\"dtBasicExample\"]/tbody/tr[1]/td[1]"));
		System.out.println( );
		System.out.println(tfirrow.getText());
	}
	public static void main(String[] args) {
		
		HandlingTable obj = new HandlingTable();
		obj.openBrowser();
		obj.verifyTables();
		

	}

}
