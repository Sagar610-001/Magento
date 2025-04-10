package Magento_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marketing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://meetanshi.in/latest/admin");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		WebElement catalogrule = driver.findElement(By.id("menu-magento-catalogrule-promo-catalog"));
		catalogrule.click();

		Thread.sleep(200);

		WebElement Cartrule = driver.findElement(By.id("menu-magento-salesrule-promo-quote"));
		Cartrule.click();

		Thread.sleep(200);

		// Communitcation

		WebElement emailtemplate = driver.findElement(By.id("menu-magento-email-template"));
		emailtemplate.click();

		Thread.sleep(200);

		WebElement newslettertemplate = driver.findElement(By.id("menu-magento-newsletter-newsletter-template"));
		newslettertemplate.click();

		Thread.sleep(200);

		WebElement newsletterqueue = driver.findElement(By.id("menu-magento-newsletter-newsletter-queue"));
		newsletterqueue.click();

		Thread.sleep(200);

		WebElement newslettersubscriber = driver.findElement(By.id("menu-magento-newsletter-newsletter-subscriber"));
		newslettersubscriber.click();

		Thread.sleep(200);

		// Seo & Search

		WebElement urlrewrite = driver.findElement(By.id("menu-magento-urlrewrite-urlrewrite"));
		urlrewrite.click();

		Thread.sleep(200);

		WebElement Search_Terms = driver.findElement(By.id("menu-magento-search-search-terms"));
		Search_Terms.click();

		Thread.sleep(200);

		WebElement searchsynonyms = driver.findElement(By.id("menu-magento-search-search-synonyms"));
		searchsynonyms.click();

		Thread.sleep(200);

		WebElement sitemap = driver.findElement(By.id("menu-magento-sitemap-catalog-sitemap"));
		sitemap.click();

		Thread.sleep(200);

		// User content

		WebElement Catalogreviews = driver
				.findElement(By.id("menu-magento-review-catalog-reviews-ratings-reviews-all"));
		Catalogreviews.click();

		Thread.sleep(200);

		WebElement pendingReview = driver.findElement(By.id("menu-magento-review-catalog-reviews-ratings-pending"));
		pendingReview.click();

		Thread.sleep(200);

	}

}
