package Madhu5260245;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Finalexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tippa\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		// 1.)	Click on Search this blog element
		driver.findElement(By.name("q")).click();
		
		// 2.)	Type your user id in search element
		driver.findElement(By.name("q")).sendKeys("5260245");
		
		// 3.)	Get the title of the webpage
		System.out.println(driver.getTitle());
		
		// 4.)	Get all the elements with tag name input
		List<WebElement> head = driver.findElements(By.tagName("input"));
		if(head.size() > 0) {
			for(int i=0; i<head.size(); i++) {
				System.out.println(head.get(i).getText());
			}
		}
		else {
			System.out.println("No anchor tags");
		}
		
		// 5.)	Select doc 4 from the dropdown list using index
		Select list = new Select(driver.findElement(By.id("drop1")));
		list.selectByIndex(4);
		
		// 6.)	Check whether blue color has been selected or not
		boolean blue = driver.findElement(By.id("checkbox2")).isSelected();
		System.out.println(blue);
		
		// 7.)	Check whether Register button is displayed
		boolean displayed = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button[3]")).isDisplayed();
		System.out.println(displayed);
		
		// 8.)	Open the webpage - https://qunitjs.com/
		driver.navigate().to("https://qunitjs.com/");
		
		// 9.)	Click on Documentation, then click on Assertions
		driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Assertions")).click();
		
		// 10.)	Display page resource of this website
		System.out.println(driver.getPageSource());
	}

}
