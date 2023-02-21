package seleniumTesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_up_down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo");
        driver.manage().window().maximize();
        Thread.sleep(3000);
     try {   JavascriptExecutor js = (JavascriptExecutor)driver;
        //to scroll down 
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
        //to scroll up
        js.executeScript("window.scrollBy(0,-200)");
        Thread.sleep(2000);
        //to scroll right
        js.executeScript("window.scrollBy(200,0)");
        Thread.sleep(2000);
        //to scroll left
        js.executeScript("window.scrollBy(-200,0)");
        Thread.sleep(2000);
        driver.close();
        driver.quit(); }catch(Exception e) {
        	System.out.println(e
        			);
        }
        
	}

}
