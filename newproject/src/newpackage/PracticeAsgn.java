package newpackage;

import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeAsgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\tippa\\Documents\\edgedriver\\msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tippa\\Documents\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.practiceselenium.com/");
		
		driver.findElement(By.linkText("Our Passion")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Menu")).click();
		driver.findElement(By.cssSelector("#wsb-button-00000000-0000-0000-0000-000451955160")).click();
		
		driver.findElement(By.id("email")).sendKeys("tippana.m.s.r@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Madhu sudhan reddy"); 
		driver.findElement(By.className("span6")).sendKeys("3300 Av ridgewood");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button")).click();
		
		driver.findElement(By.linkText("Let's Talk Tea")).click();
		
		// Customizing xpath
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Madhu sudhan reddy");
		
		driver.findElement(By.name("email")).sendKeys("tippana.m.s.r@gmail.com");
		
		// Customizing cssSelector
		driver.findElement(By.cssSelector("input[name='subject']")).sendKeys("The joy of Tea");
		
		driver.findElement(By.name("message")).sendKeys("Hi, good tea day");
		
		driver.findElement(By.cssSelector(".form-submit")).click();

	}

}
