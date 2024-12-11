package Project1_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage 
{
	WebDriver driver;
	//step 1
	
	@FindBy(xpath=("//span[.='1,299']"))
	WebElement visibleshoeprice;
	
	@FindBy(xpath=("//span[.='4.1 out of 5 stars']"))
	WebElement visiblecustomerreview;
	
	@FindBy(id=("productDescription"))
	WebElement visibleproductdescription;
	
	//step2
	public void shoeprice(WebDriver driver)
	{  
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		visibleshoeprice.isDisplayed();
	}
	public void customerreview(WebDriver driver)
	{  
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		visiblecustomerreview.isDisplayed();
	}
	public void productdescription(WebDriver driver)
	{   
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		visibleproductdescription.isDisplayed();
	}
	
	//step3
	public ProductDetailPage(WebDriver driver)                 // parameterized constructor
	{
		PageFactory.initElements(driver, this);
	}
	
}
