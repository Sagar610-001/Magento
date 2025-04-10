package Magento_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_Login {

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

		boolean isDashboardVisible = driver.getPageSource().contains("Dashboard");

		if (isDashboardVisible) {
			System.out.println("✅ User successfully redirected to the Magento dashboard.");
		} else {
			System.out.println("❌ User login failed or not redirected to the dashboard.");
		}
//
		WebElement Sales = driver.findElement(By.id("menu-magento-sales-sales"));
		Sales.click();

		Thread.sleep(500);
		/*
		 * WebElement Catalog = driver.findElement(By.xpath(
		 * "//li[@data-ui-id=\"menu-magento-catalog-catalog\"]")); Catalog.click();
		 * 
		 * Thread.sleep(500);
		 * 
		 * WebElement Customers = driver.findElement(By.xpath(
		 * "//li[@data-ui-id=\"menu-magento-customer-customer\"]")); Customers.click();
		 * 
		 * Thread.sleep(500);
		 * 
		 * WebElement Marketing = driver.findElement(By.xpath(
		 * "//li[@data-ui-id=\"menu-magento-backend-marketing\"]")); Marketing.click();
		 * 
		 * Thread.sleep(500);
		 * 
		 * WebElement Content = driver.findElement(By.xpath(
		 * "//li[@data-ui-id=\"menu-magento-backend-content\"]")); Content.click();
		 * 
		 * Thread.sleep(500);
		 * 
		 * WebElement Reports = driver.findElement(By.xpath(
		 * "//li[@data-ui-id=\"menu-magento-reports-report\"]")); Reports.click();
		 */
		//

		// Click on the sales tab

		/*
		 * WebElement Sales2 = driver.findElement(By.id("menu-magento-sales-sales"));
		 * Sales2.click();
		 */

		Thread.sleep(200);

		WebElement order = driver.findElement(By.id("menu-magento-sales-sales-order"));
		order.click();

		Thread.sleep(200);

		WebElement invoice = driver.findElement(By.id("menu-magento-sales-sales-invoice"));
		invoice.click();

		Thread.sleep(200);

		WebElement Shipment = driver.findElement(By.id("menu-magento-sales-sales-shipment"));
		Shipment.click();

		Thread.sleep(200);

		WebElement Credit_Memoms = driver.findElement(By.id("menu-magento-sales-sales"));
		Credit_Memoms.click();

		Thread.sleep(200);

		WebElement Billing_Aggrement = driver.findElement(By.id("menu-magento-sales-sales-creditmemo"));
		Billing_Aggrement.click();

		Thread.sleep(200);

		WebElement Transactions = driver.findElement(By.id("menu-magento-sales-sales-transactions"));
		Transactions.click();

		Thread.sleep(200);

		WebElement Braintree_Virtual = driver.findElement(By.id("menu-paypal-braintree-virtual-terminal"));
		Braintree_Virtual.click();

		Thread.sleep(200);
		
		
		
	}

}
