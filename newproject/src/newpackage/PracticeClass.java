package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tippa\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
	}

}
