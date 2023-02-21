package seleniumTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class allpractice {

	public static void main(String[] args) {
		System.setProperty(null, null);
		WebDriver driver = new ChromeDriver();
		driver.get(null);
		driver.findElement(By.xpath("")).sendKeys("");
		Actions a = new Actions(driver);
		Action up  = a.keyDown(Keys.SHIFT).sendKeys("abcdefg").keyUp(Keys.SHIFT).sendKeys("hojklmnop").build();
		up.perform();
        
	}

}
