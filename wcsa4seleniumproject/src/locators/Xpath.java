package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("mayuri");
}
}
