package Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends DDT_fetching_from_excel
{

	WebDriver driver;
	//step 1
	@FindBy(name="email")
	WebElement username_field;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(name="password")
	WebElement password_field;
	
	@FindBy(xpath=("//span[@id='auth-signin-button']"))
	WebElement pwd_signin;
    
	//step2
	public void username()
	{
		username_field.sendKeys(username1);	
	}
	public void wrongusername()                      // for testcase 3 ,invalid credentials
	{
		username_field.sendKeys(username2);	
	}
	public void continue1()
	{
		continuebutton.click();
	}
	public void pwd()
	{
		password_field.sendKeys(password1);	
	}
	public void pwd_signin()
	{
		pwd_signin.click();	
	}
	
	//step3
	public Loginpage(WebDriver driver)                 // parameterized constructor
	{
		PageFactory.initElements(driver, this);
	}
}
