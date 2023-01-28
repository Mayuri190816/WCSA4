package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) throws InterruptedException {
           System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
           	WebDriver driver=new ChromeDriver();
           	driver.manage().window().maximize();
           	driver.get("https://www.instagram.com");
           	String currenturl=driver.getCurrentUrl();
           	Thread.sleep(4000);
           	System.out.println(currenturl);
           		
	}

}
