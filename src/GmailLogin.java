import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		//Create driver chrome object
		WebDriver driver = new ChromeDriver();	
		//Call function get with url as parameter
		//driver.manage().window().fullscreen();
		driver.get("http://www.gmail.com");
		//Get page title and print in the console		
		driver.findElement(By.name("identifier")).sendKeys("favila0106@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type=password]")));
	    
		driver.findElement(By.name("password")).sendKeys("Titing_0211");
		//driver.findElement(By.id("passwordNext")).click();
	    
	    driver.findElement(By.xpath("//*[text()='Next']")).click();
	}

}
