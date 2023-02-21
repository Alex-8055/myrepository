package seleniumTesting;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice001 {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		//by using select class method
		WebElement d1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select drop = new Select(d1);
		drop.selectByVisibleText("Python");
		drop.selectByIndex(1);
		drop.selectByValue("sql");
		// without using select class method
		WebElement d2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		List<WebElement> d2list = driver.findElements(By.xpath("//select[@id='dropdowm-menu-2']/option"));
		for(int i=0 ; i<d2list.size();i++) {
			if(d2list.get(i).getText().contains("TestNG")) {
				d2list.get(i).click();
			}
		}
		//by dyanamic xpath
		driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']/option[3]")).click();
try {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String xyz = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
}catch(Exception e) {
	System.out.println(e);
}
				driver.close();
				
	}

}
