package takeScreenShotDynamic;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeTestNGLogin extends BaseTest{
  
	@BeforeMethod
	public void setUp()
	{
		initialization();//open browser
    }
	@Test
    public void LoginInPage() 
	{
	  SoftAssert sa = new SoftAssert();
	  String actualloginpagetitle= driver.getTitle();
	  sa.assertEquals(actualloginpagetitle,"actiTIME-Login");
	  driver.findElement(By.name="username")).sendKeys("admin");
	  driver.findElement(By.name="password")).sendKeys("admin123");
	  driver.findElement(By.id("LoginButton")).click();
	
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
