package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("");
		driver.findElement(By.xpath("")).click();
		Alert al = driver.switchTo().alert();
		//dismiss the popup
		//al.dismiss();
		Thread.sleep(3000);
		
		//accept the popup
		al.accept();
		String textofConfirm = al.getText();
		System.out.println(textofConfirm);
	}

}
