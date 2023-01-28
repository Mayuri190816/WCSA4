package assignment1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.name("_nkw")).sendKeys("Apple watches");
	
		WebElement dropDownElement = driver.findElement(By.id("gh-cat"));
		Select sel = new Select(dropDownElement);
		sel.selectByVisibleText("Jewelry & Watches");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String priceofwatch = driver.findElement(By.xpath("//span[.='Nylon Band Trail Loop For Apple Watch Ultra 38-49mm iWatch Series 8 7 6 SE 5 4']/ancestor::div[@class='s-item__info clearfix']/descendant::span[@class='s-item__price']")).getText();
		System.out.println(priceofwatch);
		
		Robot robot=new Robot();
		for(int i=0;i<11;i++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(4000);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    
		    WebElement priceoftenthproduct = driver.findElement(By.xpath("//span[.='For Apple Watch Leather Band Strap iWatch Series 8 7 6 5 4 SE 38/4240/44/41/45mm']/ancestor::li[@class='s-item s-item__pl-on-bottom']/descendant::span[@class='s-item__price']"));
		    System.out.println(priceoftenthproduct);
		    
		   WebElement dropDownElement1 = driver.findElement(By.xpath("//div[@class='srp-main srp-main--isLarge']"));
		   Select sel1 = new Select(dropDownElement1) ;
		  List<WebElement> alloptions = sel1.getOptions();
		  for(int i=0;i<alloptions.size();i++)
		  {
			  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			  Thread.sleep(1000);
			  robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		  }
		  
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		    
		 String priceoflastproduct = driver.findElement(By.xpath("//span[.='High End For Apple Watch BAND ONLY Stretch 42mm Jewerly Black Silver']/ancestor::div[@class='s-item__info clearfix']/descendant::span[@class='s-item__price']")).getText();
		  System.out.println(priceoflastproduct);  
		   
		    
	}
}
