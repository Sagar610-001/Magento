package Magento_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://meetanshi.in/latest/admin");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		WebElement Customers2 = driver.findElement(By.id("menu-magento-customer-customer"));
		Customers2.click();

		Thread.sleep(200);

		WebElement All_Customer = driver.findElement(By.id("menu-magento-customer-customer-manage"));
		All_Customer.click();

		Thread.sleep(200);

		WebElement New_Online = driver.findElement(By.id("menu-magento-customer-customer-online"));
		New_Online.click();

		Thread.sleep(200);

		WebElement Loin_As_Customre = driver.findElement(By.id("menu-magento-loginascustomerlog-login-log"));
		Loin_As_Customre.click();

		Thread.sleep(200);

		WebElement Customer_Group = driver.findElement(By.id("menu-magento-customer-customer-group"));
		Customer_Group.click();

	}

}
