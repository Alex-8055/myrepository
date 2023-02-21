package interview_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice002 {

	public static void main(String[] args)  {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		String pop = driver.getWindowHandle();
		driver.switchTo().window(pop);
// by using select classs
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByVisibleText("14");
		
		s.selectByValue("3");
		
		s.selectByIndex(14);
		
		
		//by using loop
		List<WebElement> list = driver.findElements(By.xpath("//span//span//select[2]/option"));
	for(int i=0 ; i<list.size();i++) {
		if(list.get(i).getText().contains("Mar")) {
			list.get(i).click();
		}
	}
	
;	//by using dynamic x path
	driver.findElement(By.xpath("//span//span//select[3]/option[25]")).click();
	
	}

}
