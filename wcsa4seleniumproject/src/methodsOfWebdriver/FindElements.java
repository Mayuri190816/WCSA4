package methodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("poha");
		Thread.sleep(3000);
		List<WebElement>suggestions=driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for (WebElement suggest:suggestions)
		{
			String opt=suggest.getText();
			Thread.sleep(3000);
			System.out.println(opt);
		}
	}

}
