package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		driver.get("http://spicejet.com");
		
		/**
		 * 40. Handling Static dropdown with Select webdriver API
		 */
		Select sdropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		sdropdown.selectByValue("9");
		sdropdown.selectByIndex(4);
		sdropdown.selectByVisibleText("2");
		
		/**
		 * 41. Handle Dynamic dropdowns with Webdriver API
		 */
		/*driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
		driver.findElement(By.xpath("(//a[@value='AIP'])[2]")).click();
		*/
		
		/**
		 * 43. Handling Checkboxes with webdriver API
		 */
		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_Unmr")).click();
		if(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_Unmr")).isSelected()) {
			System.out.println("Is enabled");
		}else {
			System.out.println("Is disabled");
		}
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).click();
		if(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).isSelected()) {
			System.out.println("Is enabled");
		}else {
			System.out.println("Is disabled");
		}
	}

}
