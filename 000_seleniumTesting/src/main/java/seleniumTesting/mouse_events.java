package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_events {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
       Actions a = new Actions(driver);
//        WebElement k = driver.findElement(By.xpath("//li[@name ='K']"));
//        WebElement A = driver.findElement(By.xpath("//li[@name ='A']"));
//        //to move mouse on element
//        a.moveToElement(k).build().perform();
//        //tomrightclick on elemnet
//       // a.contextClick(k).perform();
//        //to click an hold on element 
//        a.clickAndHold(k).moveToElement(A).perform();
//        //to double click
//        a.doubleClick(k);
        
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        a.dragAndDrop(source, target).build().perform();
        
        
	}
	

}
