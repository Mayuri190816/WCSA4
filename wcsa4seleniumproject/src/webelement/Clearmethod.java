package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmethod {
      public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
          WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  
		  driver.get("http://laptop-4vak7ptk/login.do");
		  WebElement usernametextbox = driver.findElement(By.name("username"));
		  usernametextbox.sendKeys("admin");
		  WebElement passwordtextbox = driver.findElement(By.name("pwd"));
		  passwordtextbox.sendKeys("manager");
		  
		  Thread.sleep(3000);
		  usernametextbox.clear();
		  passwordtextbox.clear();
		  
		  
		  
    	  
    	  
    	  
    	  
}
	
	
	
	
}
