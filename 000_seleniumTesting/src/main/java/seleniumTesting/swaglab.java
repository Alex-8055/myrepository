package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglab {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.xpath("//input[@id='user-name']"));
		name.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		WebElement usernmae = driver.findElement(By.xpath("//input[@id='first-name']"));
		usernmae.sendKeys("alex");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
		lastname.sendKeys("alex");
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		zipcode.sendKeys("411061");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
