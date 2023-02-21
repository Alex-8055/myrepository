
package interview_practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actions_class {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(true);
		WebDriver driver = new ChromeDriver(opt);
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		Actions ac = new Actions(driver);
		WebElement search = driver.findElement(By.id("inputValEnter"));
		ac.moveToElement(search).perform();
		ac.keyDown(Keys.SHIFT);
		search.sendKeys( "jackets for man"+Keys.ENTER);
		ac.keyUp(Keys.SHIFT);
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,new File("src/main/resources/screenahot/image001.JPEG") );
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		WebElement popular = driver.findElement(By.xpath("//div[text()='Popular Links']"));
	try{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",popular);
		} catch(Exception e) {
			 System.out.println(e);
		 }
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		if(popular.isDisplayed()) {
			driver.close();
			driver.quit();
		}else {
			System.out.println("error occures");
		}
		System.out.println("******************done****************");
	
	}

}
