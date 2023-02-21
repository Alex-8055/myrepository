package interview_practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {
  public static void main(String[] args)  {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		
	WebElement s =driver.findElement(By.name("q"));
String gettext  = s.getText();
String getattribute = s.getAttribute("Class");
System.out.println(s.getAttribute("Class"));
  System.out.println(s.getCssValue("title"));

		
}

}
