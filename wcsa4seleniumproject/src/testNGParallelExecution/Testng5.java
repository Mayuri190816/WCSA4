package testNGParallelExecution;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng5 {
      @Test()
      public void m1()
      {
      Assert.fail();
	  Reporter.log("m1()",true);
	  }
      
      @Test(dependsOnMethods="m1()")
      public void m2() {
    	  Reporter.log("m2() method",true);
	  }
}
