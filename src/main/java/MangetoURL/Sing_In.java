package MangetoURL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sing_In {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://meetanshi.in/latest/");
		Thread.sleep(100);

		driver.navigate().refresh();

		Thread.sleep(100);

		driver.manage().window().maximize();

		WebElement SignIn = driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
		SignIn.click();

		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("Sagarpatil21@yopmail.com");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Sagar@123");

		WebElement Showpassword = driver.findElement(By.id("show-password"));
		Showpassword.click();

		WebElement Sign = driver
				.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]"));

		Sign.click();
// Check the condition login or not 

		boolean Signpage = Sign.equals(Sign);

		if (Signpage = true) {
			System.out.println("User redirect to the Myaccount page");
		} else {
			System.out.println("User did not redirect to the Myaccount page");
		}

// Click on the logo
	}

}
