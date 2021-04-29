package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("testonly");
		driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 username']")).sendKeys("another");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123456");
		//driver.findElement(By.cssSelector("input[id='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
	}

}
