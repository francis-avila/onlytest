package tests;

import java.util.List;

import java.util.stream.Collectors;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SortingTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//francis.avila//git//Ricoh.Web.Clariti.FunctionalTests//browserDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		
		addUsers(driver);

	}
	
	private static void addUsers(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60); 
		By modalForm = By.cssSelector("div.modal-dialog.modal-lg");
		String[][] records = {{"Adam", "Sandler", "Adam.Sandler@mailinator.com", "30", "25000", "Information Technology"},
							 {"John", "Doe", "john.doe@mailinator.com", "25", "30000", "QA Department"},				
							 {"James", "Robert", "James.Robert@mailinator.com", "20", "45000", "HR Department"},
							 {"Michael", "Williams", "Michael.Williams@mailinator.com", "35", "35000", "Finance Department"},
							 {"David", "Richard", "David.Richard@mailinator.com", "40", "27000", "Management"},
							 {"Joseph", "Thomas", "Joseph.Thomas@mailinator.com", "27", "29500", "Development"},
							 {"Charles", "Christopher", "Charles.Christopher@mailinator.com", "34", "31000", "Test Department"},
							 {"Nancy", "Lisa", "Nancy.Lisa@mailinator.com", "33", "33000", "Development"}};
		for(int i = 0; i < records.length; i++)
		{
			driver.findElement(By.id("addNewRecordButton")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(modalForm));
			driver.findElement(By.id("firstName")).sendKeys(records[i][0]);
			driver.findElement(By.id("lastName")).sendKeys(records[i][1]);
			driver.findElement(By.id("userEmail")).sendKeys(records[i][2]);
			driver.findElement(By.id("age")).sendKeys(records[i][3]);
			driver.findElement(By.id("salary")).sendKeys(records[i][4]);
			driver.findElement(By.id("department")).sendKeys(records[i][5]);
			driver.findElement(By.id("submit")).click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(modalForm));
		}
	}

}