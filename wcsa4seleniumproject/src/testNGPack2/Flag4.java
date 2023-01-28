package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
  @Test
  public void loginMethod() {
	  Reporter.log("Login is done!!",true);
	 } 
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUser()
  {
	  Reporter.log("User created!!",true);
  }
  
  @Test(dependsOnMethods = "createUser")
  public void logoutMethod() {
	  Reporter.log("Logout is done!!",true);
  }
}
