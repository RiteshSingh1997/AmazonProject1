package project_Amazontest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;
import Project1_Amazon.ProductDetailPage;

public class Testcase7_productdetailpage_displays_price_reviews_description extends Launch_Amazon
{

	@Test
	public void searching_shoe() throws InterruptedException
 { 
    Homepage h1 = new Homepage(driver);
    Loginpage l1 = new Loginpage(driver);
    ProductDetailPage p1 = new ProductDetailPage(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    h1.accountandlist(driver);
    h1.signin();
    l1.username();
    l1.continue1();
    l1.pwd();
    l1.pwd_signin();
    h1.searchfield();
    h1.firstshoe();
//    p1.shoeprice(driver);
//    p1.customerreview(driver);
    p1.productdescription(driver);
    WebElement e1 = driver.findElement(By.xpath("//input[@name='submit.buy-now']"));
    Assert.assertEquals(e1.isDisplayed(), true);
    
 }
	
}
