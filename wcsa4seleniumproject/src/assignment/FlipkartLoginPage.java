package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(3000);
		driver.findElement(By.name("inputEmail")).sendKeys("katkamwarmayuri@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("inputPassword")).sendKeys("mayuri@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		driver.quit();

	}
}
