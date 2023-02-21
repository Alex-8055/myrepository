package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling {

	public static void main(String[] args)  {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.id("alertBox"));
		WebElement a2 = driver.findElement(By.id("confirmBox"));
		WebElement a3 = driver.findElement(By.id("promptBox"));
		a1.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.switchTo().alert().accept();
		if(driver.getPageSource().contains("You selected alert popup")) {
			System.out.println("u are click on a3 is succesful..");
		}else {
			System.out.println("u are cliked on a2 is not succesful");

		}
		a2.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().dismiss();
		if(driver.getPageSource().contains("You pressed Cancel in confirmation popup")) {
			System.out.println("u are click on a3 is succesful..");
		}else {
			System.out.println("u are cliked on a2 is not succesful");

		}
		a3.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().sendKeys("peter parker" + Keys.ENTER);
		if(driver.getPageSource().contains("You entered text peter parker in propmt popup")) {
			System.out.println("u are click on a3 is succesful..");
		}else {
			System.out.println("u are cliked on a2 is not succesful");

		}
		driver.close();

	}

}
