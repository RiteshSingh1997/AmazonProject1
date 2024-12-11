package Project1_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourOrderspage 
{
  WebDriver driver;
  
  @FindBy(xpath=("//span[.='Returns']"))
  WebElement clickorderpage;
  
  @FindBy(partialLinkText=("product review"))
  WebElement clickproductreview;
  
  @FindBy(xpath=("//button[@class='ryp__star__button'][5]"))
  WebElement clickfivestarrating;
  
  public void orderspage()
  {
	  clickorderpage.click();
  }
  public void productreview()
  {
	  clickproductreview.click();
  }
  public void fivestarrating()
  {
	  clickfivestarrating.click();
  }
  
  public YourOrderspage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
	
}
