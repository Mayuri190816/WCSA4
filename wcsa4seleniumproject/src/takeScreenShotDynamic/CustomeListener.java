package takeScreenShotDynamic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodname = result.getMethod().getMethodName();
		Reporter.log("the name of "+methodname+"is failed");
		failed(methodname);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
		
	}

	@Override
	public int hashCode() {
		
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
	}
}
