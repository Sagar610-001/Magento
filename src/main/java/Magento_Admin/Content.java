package Magento_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Content {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://meetanshi.in/latest/admin");

		driver.manage().window().maximize();

		driver.navigate().refresh();
		
		
		WebElement Content2 =
				 driver.findElement(By.id("menu-magento-backend-content")); Content2.click();
				 
				 
	}

}
