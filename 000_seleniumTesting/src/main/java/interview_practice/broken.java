package interview_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class broken {
	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.hyrtutorials.com/");
	System.out.println(driver.getTitle());	
		List<WebElement>links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		for(int i=0 ; i<links.size();i++) {
			links.get(i).click();
			if(driver.getTitle().contains("ERROR 404")){
				System.out.println(links.get(i).getText()+ "this is a broken link");
				driver.navigate().back();
			}
			driver.navigate().back();
		}


	
	}

}
