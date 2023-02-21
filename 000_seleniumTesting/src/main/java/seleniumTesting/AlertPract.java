package seleniumTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPract {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println(confirm.getText());
		confirm.accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

	}

}
