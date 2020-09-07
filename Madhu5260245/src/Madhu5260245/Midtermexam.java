package Madhu5260245;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Midtermexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tippa\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Part-C exam
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[2]/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("s")).sendKeys("Madhu sudhan 5260245");
		driver.findElement(By.linkText("Learning Center")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		driver.get("https://qunitjs.com/");
		driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/ul/li[2]/a")).click();
		
		
		// Facebook forget account
		driver.get("https://www.facebook.com/groups/525066904174158/");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).sendKeys("tippanamadhusudan@gmail.com");
	}

}
