package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickmethod {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://laptop-4vak7ptk/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act= new Actions(driver);
		act.doubleClick(target).perform();
		
	}
}
