package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneByFrameElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(3000);
		
		//switch the control to frame
		WebElement frameElement = driver.findElement(By.id(""));
		driver.switchTo().frame(frameElement);
		Thread.sleep(3000);
		driver.findElement(By.id("chat-icon")).click();//clicking on chat box
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Admin");
	}

}
