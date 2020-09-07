package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ramya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tippa\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");		
		String data = driver.findElement(By.id("textbox1")).getAttribute("value");
		System.out.println(data);
		String hello=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[13]/h2")).getText();
        System.out.println(hello);
        boolean h1 = driver.findElement(By.id("but2")).isDisplayed();
        System.out.println(h1);
        boolean h2=driver.findElement(By.id("checkbox1")).isSelected();
        System.out.println("selected?" + h2);
        boolean h3=driver.findElement(By.id("checkbox2")).isSelected();
        System.out.println("selected?" + h3);
        driver.navigate().to("https://facebook.com");
        driver.navigate().back();
        driver.findElement(By.linkText("Blogger")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.name("userid")).sendKeys("ramya");
        driver.findElement(By.name("pswrd")).sendKeys("12345");
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[5]/div[1]/form/button")).submit();
        String h4=driver.findElement(By.name("userid")).getTagName();
        System.out.println(h4);
        java.util.List<WebElement> aa = driver.findElements(By.tagName("a"));
		if(aa.size() > 0) {
			for(int i=0; i<aa.size(); i++) {
				System.out.println(aa.get(i).getText());
			}
		}
		System.out.println(driver.getPageSource());
		driver.close();

	}

}
