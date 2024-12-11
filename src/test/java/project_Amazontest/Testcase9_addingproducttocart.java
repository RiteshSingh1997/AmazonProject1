package project_Amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;

public class Testcase9_addingproducttocart extends Launch_Amazon
{  
	@Test
	public void addtocart() throws InterruptedException
	 {
	    Homepage h1 = new Homepage(driver);
	    Loginpage l1 = new Loginpage(driver);
	    h1.accountandlist(driver);
	    h1.signin();
	    l1.username();
	    l1.continue1();
	    l1.pwd();
	    l1.pwd_signin();
	    h1.searchfield();
	    Thread.sleep(2000);
	    h1.firstshoe();
	    Thread.sleep(2000);
	    h1.addtowishlist(driver);
	    Thread.sleep(2000);
	    h1.continueshopping(driver);
	    Thread.sleep(1000);
	    h1.addtocart(driver);
	    WebElement e1 = driver.findElement(By.name("proceedToRetailCheckout"));
	    Assert.assertEquals(e1.isDisplayed(), true);
	 
	 }

}
