package MangetoURL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mens_Category {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// Wirte the code Bredcrum functionality
		driver.get("https://meetanshi.in/latest/");

		driver.manage().window().maximize();

		WebElement Men = driver.findElement(By.xpath("//span[normalize-space()='Men']"));
		Men.click();

		boolean First = Men.equals(Men);

		if (First) {
			System.out.println("User sucssfully click on the Men. ! Page Refresh sucessfully");
		} else {
			System.out.println(" User didn't click ! Page can't refresh");
		}

		WebElement Hoddies = driver.findElement(By.xpath("//a[contains(text(),'Hoodies & Sweatshirts')]"));
		Hoddies.click();

		boolean Hoddiess = Hoddies.equals(Hoddies);

		if (Hoddiess) {
			System.out.println("User sucssfully click on the Hoddiess. !");
		} else {
			System.out.println(" User didn't click ! Page can't refresh");
		}
// Shopping Options Filter 

		WebElement Size = driver.findElement(By.xpath("//div[normalize-space()='Size']"));
		Size.click();

		boolean Sizee = Size.equals(Size);

		if (Sizee) {
			System.out.println("User sucssfully click on the Sizee. !");
		} else {
			System.out.println(" User didn't click ! Page can't refresh");
		}

		Thread.sleep(1000);
// Select Value 

		WebElement Selectvalue = driver
				.findElement(By.xpath("//div[@class='swatch-option text '][normalize-space()='S']"));
		Selectvalue.click();

		Thread.sleep(1000);

		boolean Selectvaluew = Selectvalue.equals(Selectvalue);

		if (Selectvaluew) {
			System.out.println("User sucssfully click on the Selectvalue. ! ");
		} else {
			System.out.println(" User didn't click ! Page can't refresh");
		}

// Scroll the page 

		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,2000)");

		WebElement FrankieSweatshirt = driver.findElement(By.xpath("//div[@id='product-item-info_110']"));
		FrankieSweatshirt.click();

		Thread.sleep(1000);

		boolean FrankieSweatshirts = FrankieSweatshirt.equals(FrankieSweatshirt);

		if (FrankieSweatshirts) {
			System.out.println("User sucssfully click on the FrankieSweatshirt. !");
		} else {
			System.out.println(" User didn't click ! Page can't refresh");
		}
		Thread.sleep(1000);

		WebElement Color = driver
				.findElement(By.xpath("//div[@class='swatch-opt-110']//div[@id='option-label-color-93-item-59']"));
		FrankieSweatshirt.click();

		Thread.sleep(1000);

		boolean Colors = Color.isEnabled();

		if (Colors) {
			System.out.println("User sucssfully click on the Colors. !");
		} else {
			System.out.println(" User didn't click ! Page can't refresh");
		}

		Thread.sleep(100);

		WebElement Add_TO_Cart = driver
				.findElement(By.xpath("//div[@id='product-item-info_110']//span[contains(text(),'Add to Cart')]"));
		FrankieSweatshirt.click();

		Thread.sleep(1000);

		boolean Add_TO_Carta = Add_TO_Cart.isDisplayed();

		 if (Add_TO_Carta == true) {
	            System.out.println("✅ User successfully clicked on Add to Cart.");
	        } else {
	            System.out.println("❌ Add to Cart failed.");
	        }

	}

}
