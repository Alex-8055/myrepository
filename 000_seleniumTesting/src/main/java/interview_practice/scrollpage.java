package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollpage {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinite-scroll.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.xpath("//h3[@id='masonry-isotope-packery']"));
		js.executeScript("arguments[0].scrollIntoView()",x);
		Thread.sleep(2000);
		driver.close();
	}

}
