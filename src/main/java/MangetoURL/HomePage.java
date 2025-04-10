package MangetoURL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends Browser_Launch {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

// Wirte the code Bredcrum functionality 
		driver.get("https://meetanshi.in/latest/");

		driver.manage().window().maximize();

		WebElement Men = driver.findElement(By.xpath("//span[normalize-space()='Men']"));
		Men.click();

		WebElement Whats_New = driver
				.findElement(By.xpath("//a[@href=\"https://meetanshi.in/latest/what-is-new.html\"]"));
		Whats_New.click();

		boolean First = Whats_New.equals(Whats_New);

		if (First) {
			System.out.println("User sucssfully click on the Whats_New. ! Page Refresh sucessfully");
		} else {
			System.out.println(" User didn't click ! Page can't refresh");
		}

		WebElement Women = driver.findElement(By.xpath("//span[normalize-space()='Women']"));
		Women.click();

		WebElement Gear = driver.findElement(By.xpath("//span[normalize-space()='Gear']"));
		Gear.click();

		WebElement Training = driver.findElement(By.xpath("//span[normalize-space()='Training']"));
		Training.click();

		WebElement Sale = driver.findElement(By.xpath("//span[normalize-space()='Sale']"));
		Sale.click();

		boolean value = Sale.equals(Sale);

		if (value) {
			System.out.println("All the breadcurm ! Functionality is clickable sucessfully");
		} else {
			System.out.println(" All the Bredacurm ! Functioanlity is not clickable ");
		}

// User click on the logo 		

		WebElement logo = driver.findElement(By.xpath("//a[@aria-label='store logo']//img"));
		logo.click();

		boolean Logoo = logo.equals(logo);

		if (Logoo) {
			System.out.println("User sucssfully click on the logo. ! Page Refresh sucessfully");
		} else {
			System.out.println(" User didn't click ! Page can't refresh");
		}

// Scroll the page 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

	}

}
