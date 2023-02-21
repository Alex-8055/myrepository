package seleniumTesting;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowsHandlingbyiterfator {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Set <String>allwindows = driver.getWindowHandles();
		Iterator <String> it = allwindows.iterator();
		String parent = it.next();
		 driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		 String child1 = it.next();
		 driver.switchTo().window(child1);
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='firstName']"))).sendKeys("alex");
		
		   Thread.sleep(2000);
		   driver.close();
		   driver.switchTo().window(parent);
		   driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("alex");
	       Thread.sleep(2000);
	       driver.close();
	       driver.quit();

	}

}
