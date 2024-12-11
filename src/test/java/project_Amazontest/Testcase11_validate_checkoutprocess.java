package project_Amazontest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon.Checkoutpage;
import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;

public class Testcase11_validate_checkoutprocess extends Launch_Amazon
{ 
	@Test
	public void Checkoutprocess() throws InterruptedException
	 {
		  Homepage h1 = new Homepage(driver);
		    Loginpage l1 = new Loginpage(driver);
		    Checkoutpage c1 = new Checkoutpage(driver);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    h1.accountandlist(driver);
		    h1.signin();
		    l1.username();
		    l1.continue1();
		    l1.pwd();
		    l1.pwd_signin();
		    h1.alreadyaddtocart();
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
	    WebElement e1 = driver.findElement(By.xpath("//span[.='Card number is not correct.']"));
	    Assert.assertEquals(e1.isDisplayed(), true);
	    
	    
	    
	 }

}
