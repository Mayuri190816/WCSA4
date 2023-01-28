package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import keywordDrivenFramework.BaseTest;

public class ActiTimeLogout extends BaseTest 
{
     public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException 
     {
		
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		LoginPage lp=new LoginPage(driver);
		
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH,"Password"));
		
		Thread.sleep(2000);
		Homepage hp=new Homepage(driver);
		hp.selectUser(1);
		Thread.sleep(1000);
		hp.logout();
		
		bt.closeBrowser();
	}

}
