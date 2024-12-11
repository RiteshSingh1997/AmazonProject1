package project_Amazontest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;
import Project1_Amazon.YourOrderspage;

public class Testcase14_orderspage_give5starrating extends Launch_Amazon
{ 
	@Test
	public void login_with_correct_credentials() throws InterruptedException
	{   
		
        Homepage h1 = new Homepage(driver);
        Loginpage l1 = new Loginpage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        h1.accountandlist(driver);
        h1.signin();
        l1.username();
        l1.continue1();
        l1.pwd();
        l1.pwd_signin();
        YourOrderspage y1 = new YourOrderspage(driver);
        y1.orderspage();
        y1.productreview();
        y1.fivestarrating(); 
        WebElement submittedmessage = driver.findElement(By.xpath("//span[.='Submitted']"));
        Assert.assertEquals(submittedmessage.isDisplayed(), true);
        
     }
        
		

}

