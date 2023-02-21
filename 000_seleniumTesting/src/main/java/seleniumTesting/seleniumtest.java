package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe", "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebElement Name = driver.findElement(By.id("firstName"));
		Name.sendKeys("tony");
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("stark");
		WebElement Email = driver.findElement(By.id("userEmail"));
		Email.sendKeys("tonystak001@gamil.com");
		WebElement Mobile= driver.findElement(By.id("userNumber"));
		 Mobile.sendKeys("1234567890");
		WebElement Subjects = driver.findElement(By.className("subjects-auto-complete__control css-yk16xz-control"));
		Subjects.sendKeys("english");
		
		

	}

}
