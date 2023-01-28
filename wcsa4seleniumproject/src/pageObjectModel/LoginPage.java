package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
       // to avoid StaleElementReferenceException
	
	@FindBy(name="username") private WebElement UsernameTB;
	@FindBy(name="pwd") private WebElement PasswordTB;
	@FindBy(name="username") private WebElement LoginButton;
	@FindBy(name="username") private WebElement LoggedInCheckBox;
	@FindBy(name="username") private WebElement ActiMindLink;
	@FindBy(name="username") private WebElement LicenseLink;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization

	public WebElement getUsernameTB()
	{
		return UsernameTB;
	}

	public WebElement getPasswordTB() 
	{
		return PasswordTB;
	}
	
	public WebElement getLoginButton()
	{
		return LoginButton;
	}
	
	public WebElement getLoggedInCheckBox()
	{
		return LoggedInCheckBox;
	}
	
	public WebElement getActiMindLink() 
	{
		return ActiMindLink;
	}
	
	public WebElement getLicenseLink() 
	{
		return LicenseLink;
	}

     //operational methods
	
	public void actiTimeValidLogin(String validusername,String validPassword) throws InterruptedException
	{
		UsernameTB.sendKeys(validusername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(validPassword);
		Thread.sleep(2000);
		LoginButton.click();
	}
	
	public void actiTimeInvalidLogin(String invalidusername,String invalidPassword) throws InterruptedException
	{
		UsernameTB.sendKeys(invalidusername);
		Thread.sleep(2000);
		PasswordTB.sendKeys(invalidPassword);
		Thread.sleep(2000);
		LoginButton.click();
		Thread.sleep(2000);
		UsernameTB.clear();
	}
}
