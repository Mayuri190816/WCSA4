package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("");
		driver.switchTo().frame(0);
		WebElement usn = driver.findElement(By.id(""));
		usn.sendKeys("Admin");
		WebElement password = driver.findElement(By.id(""));
		password.sendKeys("manager");
	}

}
