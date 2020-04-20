package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Job {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
			
		// Open the browser
		WebDriver driver=new ChromeDriver();
		//enter the URL
		driver.get("https://demoqa.com/");
		Thread.sleep(3000);
		
	}

}
