package assignment1;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenarios3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://jqueryui.com/droppable/");
		WebElement src = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
	  
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
		String cssProperty = target.getCssValue("color");
	     System.out.println(cssProperty);
	    String cssProperty1 = target.getCssValue("font-weight");
	    System.out.println(cssProperty1);
		
		
		
	}
}
