package project_Amazontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;

public class Testcase5_searchproduct_shoe extends Launch_Amazon
{  
	@Test
	public void searching_shoe()
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
    Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe");
 }

}
