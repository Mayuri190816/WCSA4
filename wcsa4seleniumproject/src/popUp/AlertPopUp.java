package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("");
		WebElement button = driver.findElement(By.xpath(""));
		button.click();
		//now switch ur control to Alert popup
		Alert al = driver.switchTo().alert();
		
		//accept the alert  popup
		Thread.sleep(3000);
		//al.accept();
		//dismiss the alert popup
		//al.dismiss();
		//text of alert popup
		String textofalert = al.getText();
		System.out.println(textofalert);
		
		//al.sendkeys("admin");
	}

}
