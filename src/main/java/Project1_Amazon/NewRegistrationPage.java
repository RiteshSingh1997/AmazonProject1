package Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewRegistrationPage {
WebDriver driver;
	
	//step1
	@FindBy(name="customerName")
	WebElement name;
	
	@FindBy(name="email")
	WebElement phonenum;
	
	@FindBy(name="password")
	WebElement newuserpassword;
	
	@FindBy(xpath=("//span[@id='auth-continue']"))
	WebElement verifybutton;
	
	//step2
	public void yourname()
	{
		name.sendKeys("Ritesh Singh");
	}
	public void phonenumber()
	{
		phonenum.sendKeys("7021511364");
	}
	public void password1()
	{
		newuserpassword.sendKeys("Sonali@0689");
	}
	public void clickverify()
	{
		verifybutton.click();
	}
	
	//step3
	public NewRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
