package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Classwork {
	
	@Test
	public void techfiosTest() throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://techfios.com/test/billing/?ng=login/");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("abc123");
//		driver.findElement(By.name("login")).click();
//		
		
//	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dell.com/en-us");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("l1_1"))).build().perform();
	}

}
