package assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate3 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Mayuri/Documents/MultiSelect2.html");
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropDownElement);
		List<WebElement> alloptions = sel.getOptions();
	    TreeSet<String> t=new TreeSet<String>();
	    
	    for (int i=0;i<alloptions.size();i++)
	    {
	    	WebElement opts = alloptions.get(i);
			String values = opts.getText();
			t.add(values);
	    }
	    for(String options:t)
	    {
		 System.out.println(options);
	    }
	}

}
