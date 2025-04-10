package Magento_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SALES {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://meetanshi.in/latest/admin");

		driver.manage().window().maximize();

		driver.navigate().refresh();

// Username & password

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("meetanshi");

		WebElement password = driver.findElement(By.id("login"));
		password.sendKeys("demo@123");

		WebElement Click = driver.findElement(By.xpath("//button[@class=\"action-login action-primary\"]"));
		Click.click();
		
		Thread.sleep(1000);
		
		WebElement Sales = driver.findElement(By.xpath("//li[@data-ui-id=\"menu-magento-sales-sales\"]"));
		Sales.click();
	}

}
