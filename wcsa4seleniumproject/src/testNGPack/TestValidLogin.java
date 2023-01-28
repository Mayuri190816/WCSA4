package testNGPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest{
  @Test
  public void validLogin(String username , String password) 
  {
	  driver.findElement(By.name("username")).sendKeys("");
	  driver.findElement(By.name("pwd")).sendKeys("");
  }
}
