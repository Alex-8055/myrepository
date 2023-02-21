package interview_practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
public static void main(String[] args) {
	System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Set<String> all = driver.getWindowHandles();
	System.out.println(all.size());
	for (String allwin : all) {
		if(!allwin.equals(driver.getWindowHandle())) {
			driver.close();
		}
	}
	System.out.println("***********************");
}
}
