package seleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toolQa {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("tony");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("stark");
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
		driver.findElement(By.xpath("//input[@id='exp-1']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("14/3/1998");
		WebElement drop = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select down = new Select(drop);
		down.selectByVisibleText("Browser Commands");
		
		//to check whter the dropdown menu is have multiple select option or not
		if(down.isMultiple()) {
			System.out.println("have multiple select option");
		}else {
			System.out.println("not have multiple select option");
		}
		
		//print all the options of drop down menu and size of it
		
		List<WebElement> x = down.getOptions();
		System.out.println("the size of options are: "+x.size());
		for(WebElement a : x) {
			System.out.println(a.getText());
		}
		
		
		

	}

}
