package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-masthead' and (@id='guide-icon')]")).click();
		Thread.sleep(4000);
	    List<WebElement> option = driver.findElements(By.xpath("//yt-formatted-string[.='Shorts']"));
	    Thread.sleep(3000);
	    for(WebElement opt:option)
	   {
		 String opt1 = opt.getText();
		 System.out.println(opt1);
	   }
		
	}

}

