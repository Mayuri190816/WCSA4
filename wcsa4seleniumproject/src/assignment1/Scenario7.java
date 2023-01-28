package assignment1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;


public class Scenario7 {
	public static void main(String[] args) throws InterruptedException, IOException 
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
			driver.get("https://www.bluestone.com/jewellery.html");
			WebElement alljwellery = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
			Actions act=new Actions(driver);
			act.moveToElement(alljwellery);
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[.='Kadas']")).click();
			driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
			
			driver.findElement(By.id("buy-now")).click();
			ChromeDriver cd=(ChromeDriver)driver;
			
			File src = cd.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenShots/Scenario7.jpg");
			
			Files.copy(src, dest);
			driver.close();
	
		}
}
