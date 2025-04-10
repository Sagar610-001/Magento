package Magento_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Catloge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://meetanshi.in/latest/admin");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		WebElement Catalog2 = driver.findElement(By.id("menu-magento-catalog-catalog"));
		Catalog2.click();

		Thread.sleep(200);

		WebElement Product = driver.findElement(By.id("menu-magento-catalog-catalog-products"));
		Product.click();

		Thread.sleep(200);

		WebElement Categories = driver.findElement(By.id("menu-magento-catalog-catalog-categories"));
		Categories.click();

		Thread.sleep(200);

	}

}
