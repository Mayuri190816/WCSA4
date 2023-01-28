package selectclassmethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Mayuri/Documents/MultiSelect2.html");
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='menu']"));
		Select sel=new Select(dropDownElement);
		
		List<WebElement> alloptions = sel.getOptions();
		for(int i=0;i<alloptions.size();i++)
		{
			WebElement opt = alloptions.get(i);
			String values = opt.getText();
			System.out.println(values);
			Thread.sleep(3000);
		}
		
	}
}
