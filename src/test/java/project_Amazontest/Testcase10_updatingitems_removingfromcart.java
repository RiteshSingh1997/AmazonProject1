package project_Amazontest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;

public class Testcase10_updatingitems_removingfromcart extends Launch_Amazon
{
	   @Test
	   public void new_user_register() throws InterruptedException
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
	    h1.increaseaddtocartitem();                   // update item means increase item in cart
	    Thread.sleep(2000);
	    h1.deletecartproduct();                    //delete from cart
	    WebElement e1 = driver.findElement(By.linkText(" was removed from Shopping Cart. "));
	    Assert.assertEquals(e1.isDisplayed(), true);
	}
}
