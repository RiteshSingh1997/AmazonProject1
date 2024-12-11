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

public class Testcase2_login_with_correct_credentials extends Launch_Amazon
{ 
	@Test
	public void login_with_correct_credentials() throws EncryptedDocumentException, IOException
	{   
		DDT_fetching_from_excel d1 =new DDT_fetching_from_excel();
		d1.logincredentials();
        Homepage h1 = new Homepage(driver);
        Loginpage l1 = new Loginpage(driver);
        h1.accountandlist(driver);
        h1.signin();
        l1.username();
        l1.continue1();
        l1.pwd();
        l1.pwd_signin();  
        WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertEquals(e1.isDisplayed(), true);                 // expected should be hand written and actual should come from predefined methods.
     }
        
		
               
}
