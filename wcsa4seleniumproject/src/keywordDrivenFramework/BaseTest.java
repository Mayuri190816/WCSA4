package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	
    protected static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		
		String browservalue = flib.readPropertyData(PROP_PATH,"Browser");
		String url = flib.readPropertyData(PROP_PATH,"Url");
		
		if(browservalue.equals("chrome"))
	    {
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get(url);
		}
		else if (browservalue.equals("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		else
		{
			System.out.println("enter the valid browservalue!!!");
		}
		
	}
	public void closeBrowser() {
		
		driver.quit();
	}
}
