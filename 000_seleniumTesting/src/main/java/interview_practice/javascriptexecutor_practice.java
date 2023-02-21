package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor_practice {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement usernam = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='locked_out_user'",usernam);
		js.executeScript("arguments[0].value='secret_sauce'",pass);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()",login);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();driver.quit();
		
	

	}

}
