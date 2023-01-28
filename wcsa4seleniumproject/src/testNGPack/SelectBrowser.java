package testNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
  
  WebDriver driver;

  @Test
  @Parameters("browser")
  public void openBrowser(String browserValue)
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
}
