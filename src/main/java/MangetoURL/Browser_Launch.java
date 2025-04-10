package MangetoURL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://meetanshi.in/latest/");

		driver.navigate().refresh();

		driver.manage().window().maximize();

		// Check if logo is displayed
		WebElement logo = driver.findElement(By.xpath("//a[@aria-label='store logo']//img"));

		if (logo.isDisplayed()) {
			System.out.println("Magento logo is displayed. Page loaded successfully!");
		} else {
			System.out.println("Logo not found. Something went wrong.");
		}

		driver.close();
		
	}
}
