package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Asgn3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tippa\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		Select country = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select")));
		country.selectByValue("IND");
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/");
		
		List<WebElement> anchor = driver.findElements(By.tagName("a"));
		if(anchor.size() > 0) {
			for(int i=0; i<anchor.size(); i++) {
				System.out.println(anchor.get(i).getText());
			}
		}
		else {
			System.out.println("No anchor tags");
		}
		
		boolean isDisplayed = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div/div[2]/div[3]/ul/li[3]/a")).isDisplayed();
		System.out.println(isDisplayed);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/div/div/div[2]/div[4]/ul/li[3]/a")).click();
		driver.navigate().back();
		driver.navigate().forward();
		
		Thread.sleep(7000);
		
		String tagName = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]/div[2]/h3")).getTagName();
		System.out.println(tagName);
		System.out.println(driver.getTitle());
	}

}
