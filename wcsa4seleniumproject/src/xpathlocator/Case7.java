package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case7 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.sonyliv.com/signin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='mobileNo form-control']")).sendKeys("9876543210");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='containerGDP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='emailGroup']")).sendKeys("katkamwarmayuri@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Continue']")).click();
	driver.quit();
}
}
