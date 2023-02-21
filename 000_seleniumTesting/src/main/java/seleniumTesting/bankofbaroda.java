package seleniumTesting;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bankofbaroda {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bankofbaroda.in/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[text()='Offers']")).click();
//		driver.findElement(By.xpath("//a[@aria-label='Customer Support']")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div[4]/div/div/div[1]/div/div[4]/a/div[2]/h4")).click();
	try {	
		File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotBase64 =((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}catch(Exception e) {
		System.out.println(e);
	}
	driver.close();
		
	}

}
