package newpackage;

import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Asgn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tippa\\Documents\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\tippa\\Documents\\edgedriver\\msedgedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\tippa\\Documents\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		// To go to Omnivox matrix website
		driver.get("https://matrixcollege.omnivox.ca/Login/");
		
		// To login
		driver.findElement(By.id("Identifiant")).sendKeys("5260245");
		driver.findElement(By.id("Password")).sendKeys("Madhu123");
		driver.findElement(By.cssSelector(".btn > span:nth-child(2)")).click();
		
		// To go to mio page
		driver.findElement(By.cssSelector("#region-raccourcis-services-skytech > a.raccourci.id-service_MIOE.code-groupe_mio > div.svg-icon > svg")).click();
		
		
		// To get title
		System.out.println(driver.getTitle());
		
		// To display source
		System.out.println(driver.getPageSource());
		
		// To quit
		driver.close();
	}

}
