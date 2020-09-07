package newpackage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tippa\\Documents\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/?locale=ca");
		
		driver.findElement(By.id("username")).sendKeys("This is my email id");
		driver.findElement(By.name("pw")).sendKeys("MyPassword");
		driver.findElement(By.name("Login")).click();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("This is my email id");
		driver.findElement(By.name("pass")).sendKeys("My password");
		driver.findElement(By.name("login")).click();
	}

}
