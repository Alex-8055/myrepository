package seleniumTesting;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandlings {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       System.out.println(driver.getWindowHandle() );
       String parent = driver.getWindowHandle();
       driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
       //switching on new tab/ window using for each loop
       Set <String>allwindow = driver.getWindowHandles();
       for(String child : allwindow) {
    	   if(!parent.equalsIgnoreCase(child)) {
    		   driver.switchTo().window(child);
    		   driver.manage().window().maximize();
    		   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("alex");
    		   Thread.sleep(2000);
    		   driver.close();
    	   }
       }
       driver.switchTo().window(parent);
       driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("alex");
       Thread.sleep(2000);
       driver.close();
       driver.quit();
	}

}
