package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidCreds 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.drivers","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://laptop-4vak7ptk/login.do");
		Flib flib=new Flib();
		int rc=flib.rowcount("./data/ActiTimetestdata.xls","invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
		String username = flib.readExcelData("./data/ActiTimetestdata.xls","invalidcreds",i,0);
		String password=flib.readExcelData("./data/ActiTimetestdata.xls","invalidcreds",i,1);
		
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys(username);
		WebElement pass = driver.findElement(By.name("pwd"));
		pass.sendKeys(password);
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		usn.clear();
		}
	}
}
