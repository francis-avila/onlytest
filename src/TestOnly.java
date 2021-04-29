import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Training Materials\\Automation Tools\\Browsers\\geckodriver-0.9.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://192.168.0.170:8080/index.html");
		driver.get("http://google.com");
	}

}
