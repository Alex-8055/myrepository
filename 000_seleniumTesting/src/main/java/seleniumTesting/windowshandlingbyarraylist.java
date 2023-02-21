package seleniumTesting;

import java.util.ArrayList;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandlingbyarraylist {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Set <String>allwindows = driver.getWindowHandles();
		 ArrayList<String>tab = new ArrayList<String>(allwindows);
	     String parent = tab.get(0);
		 driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[1]/a")).click();
		allwindows.add(driver.getWindowHandle());
		 String child1 = tab.get(1);  //*[@id="iFrame"]
		 driver.switchTo().window(child1);
		 driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[1]/a")).click();
		 String child2 = tab.get(2);
		 driver.switchTo().window(child2);
		 driver.findElement(By.xpath("//*[@id=\"iFrame\"]")).click();
		 Thread.sleep(2000);
		 
		 driver.close();
		 driver.switchTo().window(parent);
		
	       Thread.sleep(2000);
	       driver.close();
	       driver.quit();

	}

}
