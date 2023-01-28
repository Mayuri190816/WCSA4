package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.nike.com/join?client_id=4fd2d5e7db76e0f85a6bb56721bd51df&redirect_uri=https://www.nike.com/auth/login&response_type=code&scope=openid%20nike.digital%20profile%20email%20phone%20flow%20country&state=eaba1f0a7f4b47c6bd46e6a4f0529e5d&code_challenge=c1mgZt7m3CeaKrBUZAv_egEJSaEvKmmphdcouO-5WK8&code_challenge_method=S256");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("katkamwarmayuri@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		driver.quit();
		
	}

}
