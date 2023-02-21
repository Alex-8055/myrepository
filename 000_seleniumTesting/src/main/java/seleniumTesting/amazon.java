package seleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[text()='Best Sellers'][1]")).click();
//		driver.findElement(By.xpath("//a[text()='Hot New Releases']")).click();
//		driver.findElement(By.xpath("//a[text()='Most Wished For']")).click();
		
		List<WebElement> x = driver.findElements(By.xpath("//a"));
		for(int i=0;i<x.size();i++) {
			System.out.println(x.get(i).getText());
		}
		
		
		
		
		
		
	}

}
