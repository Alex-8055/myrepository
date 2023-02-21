package seleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown002 {

	public static void main(String[] args) {
	try {	System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		///using select class method
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(day);
		d.selectByVisibleText("14");
		d.selectByIndex(1);
		d.selectByValue("20");
		//without using select classs method
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		List <WebElement> x = driver.findElements(By.xpath("//span/select[2]/option"));
		for(int i =0 ; i<x.size();i++) {
			if(x.get(i).getText().contains("Mar")) {
				x.get(i).click();
				break;
			}
		}
		//by using dyanamic xpath
		WebElement year = driver.findElement(By.xpath("//select[@id='year']]"));
		year.click();
		String abc = "1998";
		WebElement b = driver.findElement(By.xpath("  //select[@id=\"year\"]/option[25]"));
		b.click();
		
	}catch(Exception e) {
		System.out.println(e);
	}
		

	}

}
