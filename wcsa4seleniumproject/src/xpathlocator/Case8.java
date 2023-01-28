package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mobikwik.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[contains(@class,'no-margin hideSplashScreen isPlatformMobi')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'form-input tx48 ng-pristine ng-invalid ng-touched')]")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Get OTP')]")).click();
		driver.quit();
	}

}
