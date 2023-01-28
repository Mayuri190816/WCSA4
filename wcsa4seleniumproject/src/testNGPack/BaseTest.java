package testNGPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
  
  static WebDriver driver;

  @BeforeMethod
  @Parameters({"browser","url"})
  public void setUp(String browserValue, String url)
  {
	  if(browserValue.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(url);
      }
	  else if(browserValue.equals("firefox"))
	  {
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(url);
	  }
	  else
	  {
		  System.out.println("enter valid browserValue");
	  }
  }
}