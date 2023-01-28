package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
  @Test
  public void practice(){
	  Reporter.log("This is method of Practice class",true);
  }
  @Test
  public void practice1() {
	  Reporter.log("This is practice1 method",true);
  }
  @Test
  public void practice2() {
	Reporter.log("This is practice2 method",true);  
  }
}
