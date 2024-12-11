package project_Amazontest;

import org.testng.annotations.Test;
import Project1_Amazon.Homepage;
import Project1_Amazon.Loginpage;

public class Testcase6_searching_with_filter_category_price extends Launch_Amazon
{
	@Test
	public void searchwithfilters() throws InterruptedException
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
    h1.selectcategory();
    Thread.sleep(3000);
    h1.selectpricerange1();
    Thread.sleep(3000);
    h1.selectpricerange2();
    Thread.sleep(3000);
    h1.ClickGo();
    
 }
}
