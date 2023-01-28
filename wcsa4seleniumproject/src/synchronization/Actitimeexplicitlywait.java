package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimeexplicitlywait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://laptop-4vak7ptk/login.do");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	    boolean check=wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		System.out.println(check);
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		boolean check2=wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Trackwe45"));
		System.out.println(check2);
		
		
	}

}
