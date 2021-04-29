package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();			
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		/**
		 * 45. Handling Radiobuttons with Customized xpath
		 */
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		int iCount = driver.findElements(By.xpath("//input[@name='group1']")).size();
		List<WebElement> oElement = driver.findElements(By.xpath("//input[@name='group1']"));
		for (int i = 0; i < iCount; i++) {
			String sValue= oElement.get(i).getAttribute("value");
			System.out.println(sValue);
			if (sValue.equals("Milk")) {
				oElement.get(i).click();
				System.out.println("You clicked " + sValue);
			}else {
				//System.out.println("You did not click anything.");
			}	
			
		}
	}

}
