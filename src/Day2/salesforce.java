package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		//Create driver chrome object
		WebDriver driver = new ChromeDriver();	
		driver.get("https://login.salesforce.com");
		
		/**
		 * 23. Identifying locators(className) with developer tools -2
		 */		
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click();
		
		/**
		 * 25. Identifying CSS locators with chrome and firefox Addons
		 */
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		/**
		 * 27. Practise exercises on locators learnt from the previous lectures
		 */
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}
