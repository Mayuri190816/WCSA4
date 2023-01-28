package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
        driver.get("https://www.bluestone.com/");
        driver.findElement(By.xpath("//body[@class='page-front new-hp-ui with-white-header no-footer-top    p-auto-play   no-ticker']")).click();
        Thread.sleep(3000); 
        driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();
        driver.close();
	}
}
