package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[@id='pdp-product-title' and (contains(.,'Modern Runner Unisex Sneakers'))]")).click();
		driver.quit();
	}

}
