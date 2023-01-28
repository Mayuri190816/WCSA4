package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenarios6 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.bluestone.com/jewellery.html");
		WebElement ring = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(ring);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title='Diamond Rings'])[1]")).click();
		Thread.sleep(3000);
	    String price = driver.findElement(By.xpath("//span[.='Price']")).getText();
	    System.out.println(price);
	     
	    WebElement element = driver.findElement(By.xpath("//span[.=' Popular ']"));
	    act.moveToElement(element);
	     
	    driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
	    
	    driver.close();
    
	}

}
