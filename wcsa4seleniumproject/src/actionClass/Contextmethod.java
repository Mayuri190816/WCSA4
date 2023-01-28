package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextmethod 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
			
			driver.get("file:///C:/Users/Mayuri/Documents/MultiSelect2.html");
			WebElement target = driver.findElement(By.id("menu"));
			Actions act = new Actions(driver);
			//to perform right click action
			act.contextClick(target).perform();
			
	 }
}
