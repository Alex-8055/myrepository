package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.xpath("//input[@name='email']"));
		name.sendKeys("tony stark");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("abcd123");
		WebElement CreatNewAccount = driver.findElement(By.linkText("Create New Account"));
		 CreatNewAccount.click();
		 String cureentwindow = driver.getWindowHandle();
		 driver.switchTo().window(cureentwindow);
		  WebElement Username = driver.findElement(By.xpath("//input[@name='firstname']"));
		 Username.sendKeys("tony");
		 WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		 Lastname.sendKeys("stark");
		 WebElement email = driver.findElement(By.xpath("//input[@id='u_2_g_Qa']"));
		 email.sendKeys("tonystark001@gmail.com");
		 WebElement Newpass = driver.findElement(By.xpath("//input[@type='password'][@name='reg_passwd__']"));
		 
		
		 
		
		
		

	}

}
