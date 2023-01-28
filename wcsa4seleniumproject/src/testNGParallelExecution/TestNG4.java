package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG4 {
  @Test
  public void today() {
	  
	  long threadId = Thread.currentThread().getId();
	  Reporter.log("today method"+threadId+"is a thread",true);
  }
  @Test
  public void tommorrow() {
	  
	  long threadId = Thread.currentThread().getId();
	  Reporter.log("tommorrow method"+threadId+"is a thread",true);
	  
  }
}
