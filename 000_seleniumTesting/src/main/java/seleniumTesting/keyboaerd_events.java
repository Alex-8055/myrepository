package seleniumTesting;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboaerd_events {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	//	to pass any keyboard typing
	//	search.sendKeys("xyz123@mail.com");
	//	Thread.sleep(5000);
		
	//	to press enter on element
		//search.sendKeys(Keys.ENTER);
		
	//	passing kay combination
	//	a.keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.DELETE).perform();
		
	//	release pressed keys
		
a.keyDown(Keys.SHIFT).sendKeys(search, "saurabh").keyUp(Keys.SHIFT)
.sendKeys(search,"rupekar").build().perform();
		
		

	}

}
