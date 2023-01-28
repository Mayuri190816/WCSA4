package takeScreenShot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot5 {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        EventFiringWebDriver efw= new EventFiringWebDriver(driver);
		
		
		efw.get("https://www.selenium.dev/downloads/");
	}
}
