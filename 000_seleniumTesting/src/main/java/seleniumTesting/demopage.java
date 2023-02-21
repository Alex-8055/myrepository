package seleniumTesting;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demopage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(20));
//		Actions act = new Actions(driver);
//		act.contextClick(driver.findElement(By.xpath("//select[@id='mySelect']")));
//		
		
		//select dropdown using select class method
		WebElement drop = driver.findElement(By.xpath("//select[@id='mySelect']"));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(drop));
		Select down = new Select(drop);
		down.selectByIndex(1);
		down.selectByValue("75%");
		down.selectByVisibleText("Set to 100%");
		//select dropdown value without using select class
		List <WebElement>x = driver.findElements(By.xpath("//select/option"));
		for(int i=0 ; i<x.size();i++) {
			if(x.get(i).getText().contains("Set to 25%")) {
				x.get(i).click();
			}
		}
		//by using dyanamic xpath
		driver.findElement(By.xpath("//select/option[2]")).click();
		
		File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(File.getPath());
		driver.quit();
		
	}

}
