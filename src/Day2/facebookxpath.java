package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		
		/**
		 *  //tagname[@attribute='value'] - xpath syntax
		 */
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Hello World");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		/**
		 *  Click back and clear the fields
		 */
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		
		/**
		 *  tagname[attribute='value'] - CSS syntax
		 */
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Hello World");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

}
