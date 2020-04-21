package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
			
		// Open the browser
		WebDriver driver=new ChromeDriver();
		//enter the URL
		driver.get("https://www.facebook.com/");
		//get the title and print
		System.out.println(driver.getTitle());
		// close the browser
		driver.close();
	
	}

}
