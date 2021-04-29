package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		//Create driver chrome object
		WebDriver driver = new ChromeDriver();	
				
		/**
		 * 18. Basic Methods of Webdriver
		 */
		//Call function get with url as parameter
		driver.get("http://google.com");
		//Get page title and print in the console
		System.out.println(driver.getTitle());
		//Get current url
		System.out.println(driver.getCurrentUrl());
		//Get page source
		System.out.println(driver.getPageSource());
		
		/**
		 * 19. Webdriver browser methods -2
		 */
		driver.navigate().to("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); //closes current browser.
		//driver.quit(); //closes all chrome browser opened by selenium
		
	}

}
