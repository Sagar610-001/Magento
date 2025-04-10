package MangetoURL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Account {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://meetanshi.in/latest/");
		Thread.sleep(100);

		driver.navigate().refresh();
		Thread.sleep(100);
		driver.manage().window().maximize();

		WebElement Create_Account = driver
				.findElement(By.xpath("//a[@href=\"https://meetanshi.in/latest/customer/account/create/\"]"));
		Create_Account.click();

		Thread.sleep(100);

		WebElement First_Name = driver.findElement(By.name("firstname"));
		First_Name.sendKeys("United");

		WebElement Last_Name = driver.findElement(By.name("lastname"));
		Last_Name.sendKeys("Kingdom");

		WebElement Sign_Up = driver.findElement(By.id("is_subscribed"));
		Sign_Up.click();

		WebElement Email = driver.findElement(By.id("email_address"));
		Email.sendKeys("Sagarpatil21@yopmail.com");

		Thread.sleep(100);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// specify the number of pixels the page has to be scrolled
		js.executeScript("window.scrollBy(0,2000)");

		Thread.sleep(100);

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Sagar@123");

		Thread.sleep(700);

		WebElement Confirm_Password = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
		Confirm_Password.sendKeys("Sagar@123");

		Thread.sleep(100);

		WebElement Show_Password = driver.findElement(By.id("show-password"));
		Show_Password.click();

		Thread.sleep(100);

		WebElement Create_Acc = driver
				.findElement(By.xpath("//button[@id='send2']//span[contains(text(),'Create an Account')]"));
		Create_Acc.click();

	}

}
