package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emplicitlymethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-4vak7ptk/login.do");
		String actualloginpagetitle=driver.getTitle();
		
		if (actualloginpagetitle.equals("actiTIME - Login"))
		{
			System.out.println("login page title is match: test case is passed");
		}
		else
		{
			System.out.println("login page title is not match: test case is failed");
		}
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(3000);
		
		 String actualhomepagetitle=driver.getTitle();
		 
		 if(actualhomepagetitle.equals("actiTIME - Enter Time-Track"))
		 {
			 System.out.println("home page title is match: test case is passed"); 
		 }
		 else
		 {
			 System.out.println("home page title is match: test case is failed");
		 }
	}

}
