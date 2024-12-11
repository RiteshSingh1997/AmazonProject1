package project_Amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon.Checkoutpage;
import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;

public class Testcase12_validate_each_payment_method extends Launch_Amazon
{  
	@Test
	public void Checkoutprocess() throws InterruptedException
	 {
		  Homepage h1 = new Homepage(driver);
		    Loginpage l1 = new Loginpage(driver);
		    h1.accountandlist(driver);
		    h1.signin();
		    l1.username();
		    l1.continue1();
		    l1.pwd();
		    l1.pwd_signin();
		    h1.alreadyaddtocart();
	      Checkoutpage c1 = new Checkoutpage(driver);
	    c1.proceedtobuy();
	    Thread.sleep(2000);
	    c1.Addcreditcard();
	    c1.clickentercarddetail();
	    Thread.sleep(2000);
	    c1.iframe(driver);
	    c1.entercardnumber();
	    Thread.sleep(2000);
	    c1.selectexpirydate();
	    c1.selectexpiryyear();
	    Thread.sleep(2000);
	    c1.savecarddetails();
	    c1.cancelcarddetailpage();
	    Thread.sleep(3000);
	    c1.selectupipaymentmethod();
	    c1.enterupiid();
	    c1.clickverify();
//	    WebElement e1 = driver.findElement(By.xpath("//span[.='Card number is not correct.']"));
//	    Assert.assertEquals(e1.isDisplayed(), true);
	    
	    
	 }

}
