import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoke the .exe of chrome
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		//Create driver chrome object
		WebDriver driver = new ChromeDriver();	
		//Call function get with url as parameter
		driver.get("http://google.com");
		//Get page title and print in the console
		System.out.println(driver.getTitle());
	}
}
