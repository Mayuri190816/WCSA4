package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//for open the browser
		
		BaseTest bt = new BaseTest();
		bt. openbrowser();
		
		//read the data from property  file
		Flib flib=new Flib();
		
		LoginPage lp=new LoginPage(driver);
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH,"Password"));
	}

}
