import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoke the .exe of internet explorer
		System.setProperty("webdriver.ie.driver", "C:\\work\\IEDriverServer.exe");
		//Create driver internet explorer object
		WebDriver driver = new InternetExplorerDriver();	
		//Call function get with url as parameter
		driver.get("http://google.com");
		//Get page title and print in the console
		System.out.println(driver.getTitle());
	}

}
