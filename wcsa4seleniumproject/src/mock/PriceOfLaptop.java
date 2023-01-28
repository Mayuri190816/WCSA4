package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceOfLaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
		 
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div [@class='_24_Dny']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[.='Operating System' and (@class='_2gmUFU _3V8rao')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
	
		 
         String priceoflaptop = driver.findElement(By.xpath("//div[.='HP Pavilion Gaming Core i7 11th Gen - (16 GB/512 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce G...']/ancestor::div[@class='_2kHMtA']/descendant::div[@class='_25b18c']")).getText();
         System.out.println(priceoflaptop);
	}

}
