import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		//Create driver firefox object
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://Store.DemoQA.com");
		System.out.println("Page Title is " + driver.getTitle());
		System.out.println("Page Title length is " + driver.getTitle().length());
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Page URL is " + currentUrl);
		
		if(currentUrl.equals("https://Store.DemoQA.com")) {
			System.out.println("Url is correct.");
		}else {
			System.out.println("Url is different.");
		}
		
		//System.out.println("Page source is " + driver.getPageSource());	
		String pageSource = driver.getPageSource();
		int pageSourceLength = driver.getPageSource().length();
		
		System.out.println("Page source length is " + pageSourceLength);
		
		driver.close();
	}

}
