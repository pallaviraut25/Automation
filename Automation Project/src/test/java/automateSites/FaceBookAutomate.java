package automateSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookAutomate {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));

		email.click();

		email.sendKeys("rautpallavi168");
		Thread.sleep(3000);
		// email.clear();

		// email.sendKeys("mishti123");

		WebElement pass = driver.findElement(By.xpath("//input[@ type=\"password\"]"));

		pass.click();
		pass.sendKeys("23456");

		Thread.sleep(6000);

		driver.findElement(By.xpath("//body[@dir=\"ltr\"]")).click();

		WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));

		System.out.println("The Text Present On Login Button:" + login.getText());
		System.out.println("The Text Entered is as:" + email.getAttribute("value"));

		System.out.println("Value is as:" + email.getAttribute("value"));

		System.out.println("The x Coordinate of :" + login.getLocation().x);

		System.out.println("The y Coordinate of :" + login.getLocation().y);

		System.out.println("The Size of Login Button is as:" + login.getSize());

		System.out.println("Tagname of Login is as:" + login.getTagName());

		System.out.println("Login Button is Displayed as:" + login.isDisplayed());

		System.out.println("Login Button is Selected as:" + login.isSelected());

		System.out.println("Login Button is Enabled as:" + login.isEnabled());

		driver.navigate().refresh();

		driver.navigate().back();

		driver.navigate().forward();

		driver.close();

	}

}