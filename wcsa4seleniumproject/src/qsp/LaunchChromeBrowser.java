package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/LICENSE.chromedriver");
		new ChromeDriver();
	}
}
