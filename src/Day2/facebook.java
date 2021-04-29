package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

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
		
		/**
		 * 26. Validating the accuracy of xpath and Css from browser addons
		 */
		driver.navigate().back();
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("email address");		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
		//driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		
		/**
		 * 28. Generating customized xpath from html attributes
		 */
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
