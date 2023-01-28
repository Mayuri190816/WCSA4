package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial ");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("mayuri");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("katkamwar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("katkamwarmayuri@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("actiTime");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='confirm-button']")).click();
		driver.quit();
	
	}

}
