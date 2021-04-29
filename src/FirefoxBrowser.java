import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoke the .exe of firefox
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		//Create driver firefox object
		WebDriver driver = new FirefoxDriver();	
		//Call function get with url as parameter
		driver.get("http://google.com");
		//Get page title and print in the console
		System.out.println(driver.getTitle());
	}

}
