package project_Amazontest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon.Checkoutpage;
import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;

public class Testcase13_applycouponcode extends Launch_Amazon
{ 
	@Test
	public void Checkoutprocess() throws InterruptedException
	 {
		  Homepage h1 = new Homepage(driver);
		    Loginpage l1 = new Loginpage(driver);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    h1.accountandlist(driver);
		    h1.signin();
		    l1.username();
		    l1.continue1();
		    l1.pwd();
		    l1.pwd_signin();
		    h1.alreadyaddtocart();
	      Checkoutpage c1 = new Checkoutpage(driver);
	    c1.proceedtobuy();
	    c1.couponcode();
	    c1.applycoupon();
	    WebElement e1 = driver.findElement(By.xpath("//p[.='The promotional code you entered is not valid.']"));
	    Assert.assertEquals(e1.isDisplayed(), true);
	    
	 }

}
