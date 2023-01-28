package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[.='Phone number, username, or email']")).sendKeys("mayuri");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[.='Password']")).sendKeys("mayuri123");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[.='Log in']")).click();
	    Thread.sleep(3000);
	    driver.quit();
	}

}
