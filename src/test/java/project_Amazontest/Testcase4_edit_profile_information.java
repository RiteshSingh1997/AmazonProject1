package project_Amazontest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon.DDT_fetching_from_excel;
import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;

public class Testcase4_edit_profile_information extends Launch_Amazon
{ 
	@Test
	public void Addnewaddress() throws InterruptedException, EncryptedDocumentException, IOException
	{    
		DDT_fetching_from_excel d1 = new DDT_fetching_from_excel();
		d1.logincredentials();
        Homepage h1 = new Homepage(driver);
        Loginpage l1 = new Loginpage(driver);
        h1.accountandlist(driver);
        h1.signin();
        l1.username();
        l1.continue1();
        l1.pwd();
        l1.pwd_signin();
        h1.accountandlist(driver);
        h1.youraccount();
        h1.editaddress();
        h1.adnewaddress();
        h1.fullName();
        h1.entermobilenum();
        h1.enterpincode();
        h1.addresslinefirst();
        h1.addresslinesecond();
        h1.towncity();
        h1.submitaddress();
        h1.clickeditaddress();
        h1.addlandmark();
        h1.submitaddress();
        WebElement e1 = driver.findElement(By.xpath("//div[.='Add address']"));
        Assert.assertEquals(e1.isDisplayed(), true);
		
	}

}
