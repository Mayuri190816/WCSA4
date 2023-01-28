package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeysmethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernametextbox = driver.findElement(By.name("username"));
		usernametextbox.sendKeys("admin");
		WebElement passwordtextbox = driver.findElement(By.name("password"));
		passwordtextbox.sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		driver.quit();
		
	}

}
