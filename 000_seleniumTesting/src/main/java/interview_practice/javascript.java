package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lunchbox.io/?&demo=true");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='CLOSE'][1]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//p[text()='OPEN']")));
	   Thread.sleep(2000);
	   js.executeScript("window.scrollBy(0,-250)");
	   Thread.sleep(2000); 
	   WebElement x = driver.findElement(By.xpath("//button[@class='button_button__FoWD6 button_light__1SlpM']"));
	   js.executeScript("arguments[0].scrollIntoView()",x);
	   js.executeScript("arguments[0].click()",x);
	   WebElement input = driver.findElement(By.name("firstname"));
	   js.executeScript("arguments[0].value='tony stak'",input);
	   Thread.sleep(6000); 
	   driver.close();
	   driver.quit();

	}

}
