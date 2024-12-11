package Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkoutpage 
{ 

	WebDriver driver;
	//step 1
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedtobuybutton;
	
	@FindBy(name="ppw-instrumentRowSelection")
	WebElement Addnewpaymentmethodbutton;
	
	@FindBy(xpath=("//span[.='Credit or debit card']"))
	WebElement Addcardradiobutton;
	
	@FindBy(partialLinkText="Enter card")
	WebElement clickentercarddetails;
	
	@FindBy(name="ApxSecureIframe")
	WebElement iframe;
	
	@FindBy(name="addCreditCardNumber")
	WebElement entercarddetails;
	
	@FindBy(name="ppw-expirationDate_month")
	WebElement selectdate;
	
	@FindBy(name="ppw-expirationDate_year")
	WebElement selectyear;
	
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
	WebElement savecarddetail;
	
	@FindBy(name="ppw-widgetEvent:CancelAddCreditCardEvent")
	WebElement cancelcarddetailpages;
	
	@FindBy(xpath=("//span[.='Other UPI Apps']"))
	WebElement selectupimethod;
	
	@FindBy(name="__sif_encryptedVPA_collect")
	WebElement enterupi;
	
	@FindBy(xpath=("//span[@id='pp-e7O48i-202-announce']"))
	WebElement clickverifybutton;
	
	@FindBy(xpath=("//a[@class='a-link-normal expand-panel-button celwidget']"))
	WebElement changebutton;
	
	@FindBy(id="select-destination-on-sasp-desktop-panel-id-7K5N467V27IR4TY2ZHWQG1296YMZ6VKCCA2VCCKV6ZMY69KPXTQ2EIA2OXDUK3QZ")
	WebElement selectaddressbutton;
	
	@FindBy(xpath=("//span[@class='a-button-inner']"))
	WebElement delivertothisaddressbutton;
	
	@FindBy(xpath=("//div[@class='updp-left-option no-thanks-link']"))
	WebElement nothanksbutton;
	

	@FindBy(partialLinkText="Use a gift card")
	WebElement changebuttoncouponcode;
	
	@FindBy(partialLinkText="Change")
	WebElement payingwithvisachange;
	
	@FindBy(name="ppw-claimCode")
	WebElement addcouponcode;
	
	@FindBy(name="ppw-claimCodeApplyPressed")
	WebElement applycouponcode;

    
	//step2
	public void proceedtobuy()
	{
		proceedtobuybutton.click();
	}
	public void addnewpaymentmethod()
	{
		Addnewpaymentmethodbutton.click();
	}
	public void Addcreditcard()
	{
		Addcardradiobutton.click();
	}
	public void clickentercarddetail()
	{
		clickentercarddetails.click();
	}
	public void iframe(WebDriver driver)
	{
		driver.switchTo().frame(iframe);
	}
	public void entercardnumber()
	{
		entercarddetails.sendKeys("57686879087");
	}
	public void selectexpirydate()
	{
		Select s1 = new Select(selectdate);
		s1.selectByValue("6");
	}
	public void selectexpiryyear()
	{
		Select s1 = new Select(selectyear);
		s1.selectByValue("2032");
	}
	public void savecarddetails()
	{
		savecarddetail.click();
	}
	public void cancelcarddetailpage()
	{
		cancelcarddetailpages.click();
	}
	public void selectupipaymentmethod()
	{   
		driver.switchTo().defaultContent();
	}
	public void enterupiid()
	{
		enterupi.sendKeys("ritesh@hdfcbank");
	}
	public void clickverify()
	{
		clickverifybutton.click();
	}
	
	
	public void changeaddress()
	{
		changebutton.click();
	}
	public void selectaddressradiobutton()
	{
		selectaddressbutton.click();
	}
	
	public void delivertothisaddress()
	{
		delivertothisaddressbutton.click();	
	}
	public void clickNothanks()
	{
		nothanksbutton.click();
	}
	public void payingwithvisabutton()
	{
		payingwithvisachange.click();
	}
	public void clickChangecouponcode()
	{
		changebuttoncouponcode.click();
	}
	public void couponcode()
	{
		addcouponcode.sendKeys("NEW24");
	}
	public void applycoupon()
	{
		applycouponcode.click();
	}
	
	//step3
	public Checkoutpage(WebDriver driver)                 // parameterized constructor
	{
		PageFactory.initElements(driver, this);
	}

}
