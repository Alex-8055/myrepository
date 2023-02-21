package interview_practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class windowsHansdling {
public static void main(String[] args) throws Exception {
	System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	Thread.sleep(1000);
	WebElement x = driver.findElement(By.xpath("//div[@id=\"main\"]/div[2]/div[1]/div/section[8]/div/div/div/div[2]/div/div"));
	js.executeAsyncScript("arguments[0].scrollIntoView()",x);
	Thread.sleep(1000);
	WebElement demo = driver.findElement(By.xpath("//div[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a"));
	js.executeScript("arguments[0].scrollIntoView()",demo);
	js.executeScript("aegument[0].click()",demo);

	
	
	 
}
}