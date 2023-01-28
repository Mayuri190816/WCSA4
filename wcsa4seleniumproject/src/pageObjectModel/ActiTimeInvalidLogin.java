package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActiTimeInvalidLogin extends BaseTest     
{
       public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
      {
	   BaseTest bt = new BaseTest();
	   bt.openbrowser();
	   
	   Flib flib=new Flib();
	   LoginPage lp=new LoginPage(driver);
	   
	   int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");
	  
	   for(int i=1;i<=rc;i++)
	   {
		 String invalidUsername = flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0);
		 String invalidPassword = flib.readExcelData(EXCEL_PATH,"invalidcreds",i,1);
		 
		 lp.actiTimeInvalidLogin(invalidUsername, invalidPassword);
	   }
	     
	   bt.closeBrowser();
    } 
}
