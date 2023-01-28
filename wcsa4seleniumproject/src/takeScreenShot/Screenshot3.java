package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshot3 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    RemoteWebDriver rwd = new RemoteWebDriver();
		rwd.manage().window().maximize();
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		rwd.get("https://www.selenium.dev/downloads/");
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShots/screenshot3.png");
		Files.copy(src,dest);
		
	}
}
