package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeMethod
	public void launch() {
		subhash
		System.setProperty("driver.chrome.driver","C:\\Users\\pmma\\Desktop\\chromedriver.exe" );
	
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
	}
	@Test
public void login() {

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//yt-formatted-string[contains (text(), 'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@*= 'Email or phone']")).sendKeys("sc040987@gmail.com");
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']/span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//input[@*= 'Enter your password']")).sendKeys("Subhash@123");
		driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']/span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Trending')]")).click();
driver.findElement(By.xpath("//img[@class='style-scope yt-img-shadow']")).click();
driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign out')]")).click();
		
driver.close();	
	}
	@AfterMethod
public void logout() {
	
	
}

}
