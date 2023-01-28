package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown 
{
        public static void main(String[] args) throws InterruptedException 
        {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.selenium.dev/downloads/");
			//to perform scrolling operation
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//scroll down
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,5000");
		}
}
