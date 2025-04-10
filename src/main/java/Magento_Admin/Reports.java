package Magento_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reports {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://meetanshi.in/latest/admin");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		// ReportsMarketing

		WebElement ProductCart = driver.findElement(By.id(""));
		ProductCart.click();

		Thread.sleep(200);

		WebElement Searchterms = driver.findElement(By.id(""));
		Searchterms.click();

		Thread.sleep(200);

		WebElement abandonedCart = driver.findElement(By.id(""));
		abandonedCart.click();

		Thread.sleep(200);

		WebElement newsletterReport = driver.findElement(By.id(""));
		newsletterReport.click();

		Thread.sleep(200);

		// Sales

		WebElement Order = driver.findElement(By.id(""));
		Order.click();

		Thread.sleep(200);

		WebElement Tax = driver.findElement(By.id(""));
		Tax.click();

		Thread.sleep(200);

		WebElement Invoiced = driver.findElement(By.id(""));
		Invoiced.click();

		Thread.sleep(200);

		WebElement Shipping = driver.findElement(By.id(""));
		Shipping.click();

		Thread.sleep(200);

		WebElement Refunds = driver.findElement(By.id(""));
		Refunds.click();

		Thread.sleep(200);

		WebElement Coupan = driver.findElement(By.id(""));
		Coupan.click();

		Thread.sleep(200);

		WebElement PaypalSettlement = driver.findElement(By.id(""));
		PaypalSettlement.click();

		Thread.sleep(200);

		WebElement Braintreesettlement = driver.findElement(By.id(""));
		Braintreesettlement.click();

		Thread.sleep(200);
		
		//Reivew
		  
		  WebElement ByCustomer =
		  driver.findElement(By.id("menu-magento-review-report-review-customer"));
		  ByCustomer.click();
		  
		  Thread.sleep(200);
		  
		  WebElement ByProduct =
		  driver.findElement(By.id("menu-magento-review-report-review-product"));
		  ByProduct.click();
		  
		  Thread.sleep(200);
		  
		  // Customres
		  
		  WebElement OrderTotal =
		  driver.findElement(By.id("menu-magento-reports-report-customers-totals"));
		  OrderTotal.click();
		  
		  Thread.sleep(200);
		  
		  WebElement orderCount =
		  driver.findElement(By.id("menu-magento-reports-report-customers-orders"));
		  orderCount.click();
		  
		  Thread.sleep(200);
		  
		  WebElement New =
		  driver.findElement(By.id("menu-magento-reports-report-customers-accounts"));
		  New.click();
		  
		  Thread.sleep(200);
		  
		  // Products
		  
		  WebElement Views =
		  driver.findElement(By.id("menu-magento-reports-report-products-viewed"));
		  Views.click();
		  
		  Thread.sleep(200);
		  
		  WebElement BestSeller =
		  driver.findElement(By.id("menu-magento-reports-report-products-bestsellers"))
		  ; BestSeller.click();
		  
		  Thread.sleep(200);
		  
		  WebElement LowStock =
		  driver.findElement(By.id("menu-magento-reports-report-products-lowstock"));
		  LowStock.click();
		  
		  Thread.sleep(200);
		  
		  WebElement Ordered =
		  driver.findElement(By.id("menu-magento-reports-report-products-sold"));
		  Ordered.click();
		  
		  Thread.sleep(200);
		  
		  WebElement Downloads = driver.findElement(By.id(
		  "menu-magento-downloadable-report-products-downloads")); Downloads.click();
		  
		  Thread.sleep(200);
		  
		  // Refresh Statistics
		  
		  WebElement Statistics =
		  driver.findElement(By.id("menu-magento-reports-report-statistics"));
		  Statistics.click();
		  
		  Thread.sleep(200);
		 
		 

	}

}
