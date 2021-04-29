

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		//Create driver chrome object
		WebDriver driver = new ChromeDriver();	
		driver.get("https:/www.facebook.com");
		
		/**
		 * 21. Importance of Locator Identifiers in Selenium
		 */		
		driver.findElement(By.id("email")).sendKeys("This is my first code.");
		
		/**
		 * 22. Identifying locators(id, name, linkText) with developer tools-1
		 */
		driver.findElement(By.name("pass")).sendKeys("12345678");
		driver.findElement(By.linkText("Forgot account?")).click();
	}

}
