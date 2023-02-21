package interview_practice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class broken_links {

	public static void main(String[] args) {
		System.setProperty("chrome.driver.exe",  "C:\\Users\\HP\\eclipse-workspace\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int count =0;
	for(WebElement x :links) {
		String url = x.getAttribute("href");
		URL linkurl;
		try {
			linkurl = new URL(url);
		
		HttpURLConnection hc = (HttpURLConnection)linkurl.openConnection();
		hc.setConnectTimeout(3000);
		hc.connect();
		int resp = hc.getResponseCode();
		if(resp>=400) {
			count++;
			System.out.println(url+ " - "+hc.getResponseMessage()+" this link is broken");
		}else {
			System.out.println(url+" - "+hc.getResponseMessage());
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	System.out.println("total number of broken links is :" + count);
	
	
	
	}

}
