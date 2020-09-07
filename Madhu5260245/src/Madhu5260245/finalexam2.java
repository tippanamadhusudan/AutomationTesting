package Madhu5260245;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class finalexam2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tippa\\Documents\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tippa\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.net/home");
		
		// 1.)	Click on flights
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a")).click();
		
		// 2.)	Display the title of the webpage
		System.out.println(driver.getTitle());
		
		// 3.)	Select round trip
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div/div/form/div/div/div[1]/div[1]/div/div[2]/label")).click();
		
//		// 4.)	Select details and Click on Search
		driver.findElement(By.cssSelector("#FlightsDateStart")).click();
		driver.findElement(By.cssSelector("div.datepicker:nth-child(9) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(37")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[10]/div/div/div[2]/div[37]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div/div/form/div/div/div[3]/div[4]/button")).click();
		
		
		// 5.)	Change language from English to Arabic
		driver.findElement(By.cssSelector("#dropdownLangauge")).click();
		driver.findElement(By.cssSelector("#ar")).click();
		
		// 6.)	Click on My Account
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a/i")).click();
		
		// 7.)	Click on login
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")).click();
		//driver.findElement(By.linkText("Login")).click();
		
		// 8.)	Fill up any details
		driver.findElement(By.xpath("/html/body/div/div[1]/section/div/div[1]/div[2]/form/div[3]/div[1]/label/input")).sendKeys("tippanamadhusudhan");
		driver.findElement(By.name("password")).sendKeys("finalexam");
		
		// 9.)	Click on Login
		driver.findElement(By.xpath("/html/body/div/div[1]/section/div/div[1]/div[2]/form/button")).click();
		
		// 10.)	Display all the elements with link
		List<WebElement> head = driver.findElements(By.tagName("a"));
		if(head.size() > 0) {
			for(int i=0; i<head.size(); i++) {
				System.out.println(head.get(i).getText());
			}
		}
		else {
			System.out.println("No element with links");
		}
	}

}
