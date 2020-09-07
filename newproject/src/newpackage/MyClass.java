package newpackage;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyClass {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\tippa\\Documents\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tippa\\Documents\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
//		// 1) To go to the link
//		driver.get("https://www.facebook.com/");
//		
//		// 2) Get title
//		System.out.println(driver.getTitle());
//		
//		// 3) Method to check whether we are on the url we intended to
//		System.out.println(driver.getCurrentUrl());
//		
//		// 4) Get page resources
//		driver.getPageSource();
//		
		driver.get("https://www.google.com/");
//		
//		// 5) To go back to previous url or browse back
//		driver.navigate().back();
//		
//		// 6) Close or quit
//		driver.close(); // Only closes current tab
//		driver.quit(); // Closes all the open tabs
		
		// locator techniques and tools to identify web objects
		// id, classname, name, linktext, xpath, css
		driver.get("https://www.facebook.com/");
		
		// To find element and enter content
		driver.findElement(By.id("email")).sendKeys("This is my email id");
		driver.findElement(By.name("pass")).sendKeys("My password");
		
		// To go to the link on the current page
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.name("email")).sendKeys("This is my email id");
		
		driver.navigate().back();
		driver.navigate().back();
		
		// To click on LOG in button
//		driver.findElement(By.name("login")).click();
	}
}
