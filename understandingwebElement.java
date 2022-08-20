package seleniumBasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class understandingwebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\TOPU's_QA_DRIVE\\chromedriver.exe");
	WebDriver driver =	new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/index.php");
		
	WebElement usernametextBox = driver.findElement(By.name("userName"));
	usernametextBox.sendKeys("Tapati2345");
	
	driver.findElement(By.name("password")).sendKeys("5645646666");
	
	driver.findElement(By.name("submit")).click();
	
	Thread.sleep(2000);
		driver.close();
		
		
		
	}

	private static void Click() {
		// TODO Auto-generated method stub
		
	}

}
