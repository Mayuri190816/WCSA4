package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		String Sourcecode=driver.getPageSource();
		Thread.sleep(4000);
		System.out.println(Sourcecode);
		
		
	}

}
