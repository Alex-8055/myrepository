package seleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//to select value from dropdown with ot eithout using select class
public class dropdown {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		//using select class*****************************
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		Select ok = new Select(dropdown);
		ok.selectByVisibleText("India");
		ok.selectByValue("AGO");
		ok.selectByIndex(1);  
		
		List<WebElement> x = ok.getOptions();
		for(int i=0 ; i<x.size(); i++) {
			System.out.println(x.get(i).getText());
			
		}
		System.out.println(x.size());
		if(ok.isMultiple()) {
			System.out.println("drodown is have multiple select option");
		}else {
			System.out.println("drodown is have  not multiple select option");
		}
		
		//without using select class method...................******
		List<WebElement> z = driver.findElements(By.xpath("//select/option"));
		for(int i=0 ; i<z.size(); i++) {
			System.out.println(z.get(i).getText());
		}
		System.out.println(z.size());
		for(int i=0 ; i<z.size();i++) {
			if(z.get(i).getText().contains("India")) {
				z.get(i).click();
			}
		}
		
	}

}
