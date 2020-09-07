package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asgn3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tippa\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		String getAttribute = driver.findElement(By.id("rotb")).getAttribute("value");
		System.out.println(getAttribute);
		
		String getText = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/h3/a")).getText();
		System.out.println(getText);
		
		boolean isDisplayed = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println(isDisplayed);
		
		boolean isSelected = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println(isSelected);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[11]/div/ul/li[1]/a")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[7]/div[1]/form/input[3]")).submit();
		
		String tagName = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[7]/div[1]/h1")).getTagName();
		System.out.println(tagName);
		
		List<WebElement> head = driver.findElements(By.tagName("a"));
		if(head.size() > 0) {
			for(int i=0; i<head.size(); i++) {
				System.out.println(head.get(i).getText());
			}
		}
		else {
			System.out.println("No anchor tags");
		}
	}

}
