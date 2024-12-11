package Project1_Amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends DDT_fetching_from_excel
{ 
	WebDriver driver;
	//step 1
	@FindBy(xpath=("//span[@class='nav-line-2 ']"))
	WebElement accountlist;
	
	@FindBy(linkText="Start here.")
	WebElement clickregister;
	
	@FindBy(xpath=("//span[.='Your Account']"))
	WebElement clickyouraccount;
	
	@FindBy(xpath=("//span[.='Edit addresses for orders and gifts']"))
	WebElement addaddress;
	
	@FindBy(xpath=("//div[.='Add address']"))
	WebElement addaddress1;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement fullname;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement mobilenumber;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement pincode1;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement addressline1;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement addressline2;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement town;
	
	@FindBy(id="address-ui-widgets-form-submit-button")
	WebElement submitaddress;
	
	@FindBy(id="ya-myab-address-edit-btn-1")
	WebElement clickedit;
	
	@FindBy(id=("address-ui-widgets-landmark"))
	WebElement nearbylandmark;
	
	@FindBy(xpath=("//span[.='Sign in']"))
	WebElement signinbutton;
		
	@FindBy(id="twotabsearchtextbox")
	WebElement searchfield;
	
	@FindBy(linkText="Men's Shoes")
	WebElement menshoes;
	
	@FindBy(id="p_36/range-slider_slider-item_lower-bound-slider")
	WebElement pricerange1;
	@FindBy(id="p_36/range-slider_slider-item_upper-bound-slider")
	WebElement pricerange2;
	
	@FindBy(xpath=("//span[@id='a-autoid-63']"))
	WebElement gobutton;
	
	@FindBy(xpath=("(//a[@class='a-link-normal s-no-outline'])[1]"))
	WebElement clickfirstshoe;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist;
	
	@FindBy(xpath=("//span[@class='a-button a-button-span12 a-button-primary']"))
	WebElement continue2;
	
	@FindBy(xpath=("//span[.='Sign Out']"))
	WebElement logout;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	@FindBy(partialLinkText="Go to Cart")
	WebElement Gotocartbutton;
	
	@FindBy(id="nav-cart")
	WebElement addedtocartproducts;
	
	@FindBy(xpath=("//span[@class='a-size-small sc-action-delete']"))
	WebElement deleteproductfromcart;
	

	@FindBy(xpath=("//span[@class='a-icon a-icon-small-add']"))
	WebElement updateitem;
	
	//step2
	public void accountandlist(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountlist).perform();	
	}
	public void Registerbutton()
	{
		clickregister.click();
	}
	public void youraccount()
	{
		clickyouraccount.click();
	}
	public void editaddress()
	{
		addaddress.click();
	}
	public void adnewaddress()
	{
		addaddress1.click();
	}
	public void fullName()
	{
		fullname.sendKeys("Ritesh Singh");
	}
	public void entermobilenum()
	{
		mobilenumber.sendKeys("7021511364");
	}
	public void enterpincode() throws EncryptedDocumentException, IOException
	{  
		pincode1.sendKeys(pincode);
	}
	public void addresslinefirst() throws EncryptedDocumentException, IOException
	{   
		    addressline1.sendKeys(Addressline1);
	}
	public void addresslinesecond() throws EncryptedDocumentException, IOException
	{   
		    addressline2.sendKeys(Addressline2);
	}
	public void towncity() throws EncryptedDocumentException, IOException
	{   
		    town.sendKeys(TownCity);
	}
	public void submitaddress()
	{
		submitaddress.click();
	}
	public void clickeditaddress()
	{
		clickedit.click();
 
	}
	public void addlandmark()
	{   
		nearbylandmark.sendKeys("Near Ankur Hospital");
	}
	
	public void signin()
	{
		signinbutton.click();
	}
	
	public void searchfield()
	{
		searchfield.sendKeys("shoe" + Keys.ENTER);
		
	}
	public void selectcategory()
	{
		menshoes.click();
		
	}
	public void selectpricerange1()
	{
		pricerange1.sendKeys("2000");
		
	}
	public void selectpricerange2()
	{
		pricerange2.sendKeys("5000");
		
	}
	public void ClickGo()
	{
		gobutton.click();
		
	}
	
	
	public void firstshoe()
	{
		clickfirstshoe.click();	
	}
	public void addtowishlist(WebDriver driver)
	{   
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		wishlist.click();
	}
	public void continueshopping(WebDriver driver)
	{   
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		continue2.click();	
	}
	
	public void logout()
	{
		logout.click();	
	}
	
	public void addtocart(WebDriver driver)
	{   
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		addtocart.click();	
	}
	public void Gotocart()
	{
		Gotocartbutton.click();
	}
	public void alreadyaddtocart()
	{
		addedtocartproducts.click();
	}
	public void increaseaddtocartitem()
	{
		updateitem.click();
	}
	public void deletecartproduct()
	{
		deleteproductfromcart.click();
	}
	
	//step3
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
