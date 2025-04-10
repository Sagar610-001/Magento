package MangetoURL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Product_Details_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// Wirte the code Bredcrum functionality
		driver.get("https://meetanshi.in/latest/frankie-sweatshirt.html");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		System.out.println("User enter the speacific url and redirect to the speacific Product detail page ");

		Thread.sleep(3000);

		// Select Size (e.g., M)
		WebElement sizeM = driver.findElement(By.id("option-label-size-144-item-167"));
		sizeM.click();
		Thread.sleep(500);

		// Select Color (e.g., Yellow)
		WebElement colorWhite = driver.findElement(By.id("option-label-color-93-item-59"));
		colorWhite.click();
		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		// Click Add to Cart
		WebElement addToCartBtn = driver.findElement(By.id("product-addtocart-button"));
		addToCartBtn.click();
		Thread.sleep(3000);

		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,-900)");

		// Confirmation message (e.g., in a popup or mini-cart)
		WebElement MiniCarticon = driver.findElement(By.xpath("//a[@class=\"action showcart\"]"));

		if (MiniCarticon.isDisplayed()) {
			System.out.println("✅ Product successfully added to cart: " + MiniCarticon.getText());
		} else {
			System.out.println("❌ Add to Cart failed!");
		}

		MiniCarticon.click();

		Thread.sleep(3000);

		WebElement Vieweditcart = driver.findElement(By.xpath("//a[@class=\"action viewcart\"]"));

		Vieweditcart.click();

		Thread.sleep(100);

		/*
		 * if (Vieweditcart.isDisplayed()) {
		 * System.out.println("✅ User successfully Vieweditcart redirect page: " +
		 * Vieweditcart.getText()); } else { System.out.println("❌ failed!"); }
		 */

// Increase the QTY -- 
		/*
		 * WebElement QTY = driver.findElement(By.xpath("//input[@id='cart-51-qty']"));
		 * QTY.clear();
		 * 
		 * Thread.sleep(100);
		 * 
		 * QTY.sendKeys("2");
		 * 
		 * boolean QTYCHECK = QTY.isDisplayed();
		 * 
		 * if (QTYCHECK == true) {
		 * System.out.println(" User has been added to the QTY value "); } else {
		 * System.out.println("❌ failed! "); }
		 */

// Proceed to Checkout 
		WebElement ProceedTOChekout = driver.findElement(By.xpath("//button[@data-role=\"proceed-to-checkout\"]"));

		ProceedTOChekout.click();

		Thread.sleep(2000);
		/*
		 * if (ProceedTOChekout.isDisplayed()) {
		 * System.out.println("✅ User successfully ProceedTOChekout redirect page: " +
		 * ProceedTOChekout.getText()); } else { System.out.println("❌ failed!"); }
		 */

// 	Shipping Address Page 

		// Fill Email Address
		/*
		 * WebElement Email = driver.findElement(By.name("username"));
		 * Email.sendKeys("testuser@yopmail.com"); Thread.sleep(200);
		 */

		// First Name
		WebElement First = driver.findElement(By.name("firstname"));
		First.sendKeys("John");
		Thread.sleep(200);

		// Last Name
		WebElement Last = driver.findElement(By.name("lastname"));
		Last.sendKeys("Doe");
		Thread.sleep(200);

		// Company (Optional)
		WebElement Company = driver.findElement(By.name("company"));
		Company.sendKeys("OpenAI");
		Thread.sleep(200);

		// Street Address
		WebElement Address = driver.findElement(By.name("street[0]"));
		Address.sendKeys("123 Main St");
		Thread.sleep(200);

		JavascriptExecutor jsss = (JavascriptExecutor) driver;
		jsss.executeScript("window.scrollBy(0,1500)");

		// Country - usually auto-filled
		Select countryDropdown = new Select(driver.findElement(By.name("country_id")));
		countryDropdown.selectByVisibleText("United States");

		// State/Province
		Select stateDropdown = new Select(driver.findElement(By.name("region_id")));
		stateDropdown.selectByVisibleText("California");

		Thread.sleep(200);

		// City
		WebElement City = driver.findElement(By.name("city"));
		City.sendKeys("San Francisco");
		Thread.sleep(200);

		// Zip/Postal Code
		WebElement Postal = driver.findElement(By.name("postcode"));
		Postal.sendKeys("94103");

		Thread.sleep(200);

		// Phone Number
		WebElement Number = driver.findElement(By.name("telephone"));
		Number.sendKeys("1234567890");

// Next Button 

		WebElement Next = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		Next.click();

// Place Order 

		WebElement PlaceOrder = driver.findElement(By.xpath("//button[@title='Place Order']"));
		PlaceOrder.click();

		System.out.println("Thank you for your purchase!");

	}

}
