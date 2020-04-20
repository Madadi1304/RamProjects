package qsp;

import org.openqa.selenium.WebDriver;

public class Demo {
	static void test(WebDriver driver) {
		driver.get("https://www.seleniumhq.org/download/");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
