package testNGPack2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotations {
  @Test
  public void test() {
	  Reporter.log("@Test Annotations",true);
  }
  @BeforeSuite
  public void beforesuite() {
	  Reporter.log("@beforesuite Annotations",true);
  }
  @BeforeClass
  public void beforeclass() {
	  Reporter.log("@beforeclass Annotations",true);
  }
  @BeforeTest
  public void beforetest() {
	  Reporter.log("@beforetest Annotations",true);
  }
  @AfterSuite
  public void aftersuite() {
	  Reporter.log("@aftersuite Annotations",true);
  }
  @BeforeMethod
  public void beforemethod() {
	  Reporter.log("@beforemethod Annotations",true);
  }
  @AfterClass
  public void afterclass() {
	  Reporter.log("@afterclass Annotations",true);
  }
  @AfterMethod
  public void aftermethod() {
	  Reporter.log("@aftermethod Annotations",true);
  }
  @AfterTest
  public void aftertest() {
	  Reporter.log("@aftertest Annotations",true);
  }
}
