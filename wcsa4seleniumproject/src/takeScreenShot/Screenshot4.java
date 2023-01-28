package takeScreenShot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot4 {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		rwd.manage().window().maximize();
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		rwd.get("https://www.selenium.dev/downloads/");
		
		
		
		
	}
}
