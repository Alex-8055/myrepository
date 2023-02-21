package seleniumTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertprac002 {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//alert 
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.accept();
		if (driver.getPageSource().contains("You successfully clicked an alert")) {
			System.out.println("You successfully clicked an alert");                 
		}
		
		 //confirmation
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(2000);
					Alert alt2 = driver.switchTo().alert();
					System.out.println(alt2.getText());
					alt2.dismiss();
					if (driver.getPageSource().contains("You clicked: Cancel")) {           
						System.out.println("You clicked: Cancel");                 
					}
	//prompt
					
					driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
					Thread.sleep(2000);
							Alert alt3 = driver.switchTo().alert();
							System.out.println(alt3.getText());
							alt3.sendKeys("why so serious....!!!");
							alt3.accept();  
							if (driver.getPageSource().contains("You entered: why so serious....!!!")) {           
								System.out.println("You entered: why so serious....!!!");  
								Thread.sleep(2000);
						 driver.close();
						 System.out.println("............................................"); 
							
								
							}
							
							
							    
							    
							    
					
					
					

	}

}
