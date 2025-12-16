package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.BaseClass;

public class SimpleAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		launch_browser("chrome");
		
		HitUrl("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		
		Alert SA = driver.switchTo().alert();
		
		Thread.sleep(3000);
		SA.accept();
		
		//NoAlertPresentException
		//System.out.println(SA.getText());
		
		System.out.println("--------------Confirmation Alert-----------------");
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		Alert CA = driver.switchTo().alert();
		
		Thread.sleep(3000);
		//CA.accept();
		CA.dismiss();
		
		WebElement text = driver.findElement(By.cssSelector("p#demo"));
		System.out.println("The Text Present Is As:"+text.getText());
		
		System.out.println("--------------Prompt Alert--------------");
		
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
		
		driver.findElement(By.xpath("//button[@ class=\"btn btn-info\"]")).click();
		
		Alert PA = driver.switchTo().alert();
		
		Thread.sleep(3000);
		PA.sendKeys("Pallavi Raut");
		PA.accept();
		
		WebElement txt = driver.findElement(By.xpath("//p[@ id=\"demo1\"]"));
		
		//System.out.println(txt.getText());
		//System.out.println(txt.getAttribute("value"));
		//PA.dismiss();
	}

}
