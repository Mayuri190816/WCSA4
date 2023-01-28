package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvaluemethod {
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://laptop-4vak7ptk/login.do");
		WebElement loginbutton = driver.findElement(By.xpath("//a[.='Login']"));
		String cssproperty = loginbutton.getCssValue("font-size");
		System.out.println(cssproperty);
		
		
	}
}
